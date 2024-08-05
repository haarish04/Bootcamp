abstract class TelecomService {
    private String serviceName;
    private double serviceCost;
    private int serviceDuration;

    public TelecomService(String serviceName, double serviceCost, int serviceDuration){
        this.serviceName= serviceName;
        this.serviceCost= serviceCost;
        this.serviceDuration= serviceDuration;
    }

    public abstract double calculateTotalCost();
    public abstract String getServiceDetails();

    public void applyDiscount(double discountPercentage){
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
        setServiceDuration(getServiceDuration()+ additionalDays);
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

public class TestTelecomService {
    public static void main(String[] args) {
        PrepaidService prepaidService = new PrepaidService("Premium Plan", 50, 30, 5);
        PostpaidService postpaidService = new PostpaidService("Ultimate Plan", 75, 30, 100);

        System.out.println("Before Discount:");
        System.out.println("Prepaid Service Details: " + prepaidService.getServiceDetails());
        System.out.println("Total Cost: $" + prepaidService.calculateTotalCost());

        prepaidService.applyDiscount(10);
        System.out.println("\nAfter Discount:");
        System.out.println("Prepaid Service Details: " + prepaidService.getServiceDetails());
        System.out.println("Total Cost: $" + prepaidService.calculateTotalCost());

        prepaidService.renewService(15);
        System.out.println("\nAfter Renewal:");
        System.out.println("Prepaid Service Details: " + prepaidService.getServiceDetails());
        System.out.println("Total Cost: $" + prepaidService.calculateTotalCost());

        System.out.println("\nBefore Discount:");
        System.out.println("Postpaid Service Details: " + postpaidService.getServiceDetails());
        System.out.println("Total Cost: $" + postpaidService.calculateTotalCost());

        postpaidService.applyDiscount(10);
        System.out.println("\nAfter Discount:");
        System.out.println("Postpaid Service Details: " + postpaidService.getServiceDetails());
        System.out.println("Total Cost: $" + postpaidService.calculateTotalCost());

        postpaidService.renewService(15);
        System.out.println("\nAfter Renewal:");
        System.out.println("Postpaid Service Details: " + postpaidService.getServiceDetails());
        System.out.println("Total Cost: $" + postpaidService.calculateTotalCost());
    }
}