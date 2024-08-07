public class TestTelecomBilling {
    public static void main(String[] args) {

        TelecomBilling testBilling = new TelecomBilling();

        testBilling.addCustomer("01", "prepaid", 5);
        testBilling.addCustomer("02", "prepaid", 7);
        testBilling.addCustomer("03", "postpaid", 8);
        testBilling.addCustomer("04", "postpaid", 25);
        testBilling.addCustomer("05", "postpaid", 2);
        testBilling.addCustomer("06", "prepaid", 98);
        testBilling.addCustomer("07", "postpaid", 56);

        testBilling.updateCustomerUsage(10, "prepaid", "01");



    }
    
}
