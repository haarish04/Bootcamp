import java.util.*;
public class TelecomBilling {

    private String custId;
    private String service;
    private int usage;

    private Map<String,Integer> serviceUsage;
    private Map<String, Map<String, Integer>> customerUsage;

    TelecomBilling(){
        serviceUsage = new HashMap<>();
        customerUsage= new HashMap<>();        
    }

    public void addCustomer(String custId, String service, int usage){
        this.custId = custId;
        this.service= service;
        this.usage= usage;
        serviceUsage.put(this.service,this.usage);
        customerUsage.put(this.custId,serviceUsage);
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public Map<String, Integer> getServiceUsage() {
        return serviceUsage;
    }


    public Map<String, Map<String, Integer>> getCustomerUsage() {
        return customerUsage;
    }


    public String updateCustomerUsage(int usage, String service, String custId){
        if(this.customerUsage.containsKey(custId)){
            Map<String,Integer> updateCust= this.customerUsage.get(custId);
            if(updateCust.containsKey(service)){
                updateCust.put(service, usage + updateCust.getOrDefault(custId, 0));
            }
            this.customerUsage.put(custId,updateCust);
            return "Successfull";
        }
        return "Update failed";

    }

    public String getAllUsage(String custId){
        if(this.customerUsage.containsKey(custId)){
            return this.customerUsage.get(custId).toString();
        }
        return "Customer not found";

    }
    
    public String getAllCustomers(){
        return this.customerUsage.toString();
    }
}
