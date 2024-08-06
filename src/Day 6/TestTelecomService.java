import java.util.*;

public class TestTelecomService {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter service type: ");
        String serviceType= sc.next();

        System.out.println("Enter Service Name: ");
        String serviceName= sc.next();

        System.out.println("Enter Service Cost: ");
        int serviceCost = sc.nextInt();

        System.out.println("Enter duration :");
        int serviceDuration = sc.nextInt();

        int dataBalance;
        int monthlyLimit;
        

        PrepaidService prepaidService;
        if(serviceType.equals("Prepaid")){

            System.out.println("Enter data balance: ");
            dataBalance= sc.nextInt();
            prepaidService = new PrepaidService(serviceName,serviceCost, serviceDuration, dataBalance);
        

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

        }

        PostpaidService postpaidService;
        if(serviceType.equals("Postpaid")){
            System.out.println("Enter monthly limit: ");
            monthlyLimit= sc.nextInt();
        
            postpaidService = new PostpaidService(serviceName, serviceCost, serviceDuration, monthlyLimit);

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

        sc.close();
    }
}
