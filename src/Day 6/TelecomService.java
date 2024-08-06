class InvalidDiscountException extends Exception{
    public InvalidDiscountException(){
        super("Invalid discount applied");
    }
}

class InvalidServiceDurationException extends Exception{
    public InvalidServiceDurationException(){
        super("Invalid duration");
    }
}

public abstract class TelecomService {
    private String serviceName;
    private double serviceCost;
    private int serviceDuration;

    public TelecomService(String serviceName, double serviceCost, int serviceDuration){
        this.serviceName= serviceName;
        this.serviceCost= serviceCost;
        try{
            if(serviceDuration<0)
                throw new InvalidServiceDurationException();
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    public abstract double calculateTotalCost();
    public abstract String getServiceDetails();

    public void applyDiscount(double discountPercentage){
        try{
            if(discountPercentage<0 || discountPercentage >100)
                throw new InvalidDiscountException();
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
        this.serviceCost-= this.serviceCost *discountPercentage/100;
    }
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getServiceDuration() {
        return serviceDuration;
    }

    public void setServiceDuration(int serviceDuration) {
        this.serviceDuration = serviceDuration;
    }
    
}

interface Renewable{
    abstract void  renewService(int additionalDays);
}

class PrepaidService extends TelecomService implements Renewable {
    private double dataBalance;

    public PrepaidService(String serviceName, double serviceCost, int serviceDuration, double dataBalance) {
        super(serviceName, serviceCost, serviceDuration);
        this.dataBalance = dataBalance;
    }

    
    public double calculateTotalCost() {
        double totalCost = getServiceCost() * getServiceDuration();
        if (dataBalance < 1) {
            totalCost += 10;
        }
        return totalCost;
    }

    public String getServiceDetails() {
        return "Service Name: " + getServiceName() + ", Data Balance: " + dataBalance + " GB";
    }

    
    public void renewService(int additionalDays) {
        try{
            if (additionalDays<0)
                throw new InvalidServiceDurationException();
            setServiceDuration(getServiceDuration()+ additionalDays);

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}

class PostpaidService extends TelecomService implements Renewable {
    private double monthlyLimit;

    public PostpaidService(String serviceName, double serviceCost, int serviceDuration, double monthlyLimit) {
        super(serviceName, serviceCost, serviceDuration);
        this.monthlyLimit = monthlyLimit;
    }

    public double calculateTotalCost() {
        double totalCost = getServiceCost();
        if (getServiceDuration() > monthlyLimit) {
            totalCost += 20;
        }
        return totalCost;
    }

    public String getServiceDetails() {
        return "Service Name: " + getServiceName() + ", Monthly Limit: " + monthlyLimit + " GB";
    }

    public void renewService(int additionalDays) {
        setServiceDuration(getServiceDuration()+additionalDays);
    }
}
