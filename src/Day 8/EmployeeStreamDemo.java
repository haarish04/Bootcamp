import java.util.*;
public class EmployeeStreamDemo {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "abc", 500, "SDE");
        Employee emp2 = new Employee(2, "bhfkjbsckfdvc", 600, "SDE");
        Employee emp3= new Employee(3, "vevre", 200, "SDE");
        Employee emp4 = new Employee(4, "fefef", 300, "SDE");

        List<Employee> empList = List.of(emp1,emp2,emp3,emp4);

        empList.stream().forEach(emp -> System.out.println(emp));

    }
    
}
