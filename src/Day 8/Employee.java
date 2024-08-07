public class Employee {

    private int empID;
    private String empName;
    private double salary;
    private String role;

    public Employee(int empID, String empName, double salary, String role) {
        this.empID = empID;
        this.empName = empName;
        this.salary = salary;
        this.role = role;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    @Override
    public String toString(){
        return "Employee ID: " + this.empID + "\t" + "Employee name: "+ this.empName + "\t" + "Employee role: " + "\t"+this.role+ "\t"+ "Employee Salary: "+ this.salary;
    }
    
    
}
