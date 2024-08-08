import java.util.*;
public class EmployeeStreamDemo {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "abc", 500, "SDE");
        Employee emp2 = new Employee(2, "bhfkjbsckfdvc", 600, "Cloud");
        Employee emp3 = new Employee(3, "vevre", 200, "SDE");
        Employee emp4 = new Employee(4, "fefef", 300, "Devops");

        //List.of creates an immutable list and does not permit any sorting and other operations on changing the elements present
        //List<Employee> empList = List.of(emp1,emp2,emp3,emp4);


        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        empList.stream().forEach(emp -> System.out.println(emp));

        System.out.println("Number of employees: ");
        System.out.println(empList.stream().count());
        
        System.out.println("Total Salary: ");
        System.out.println(empList.stream().map(Employee :: getSalary).reduce((num1,num2)-> (num1 + num2)).get());

        System.out.println("Total Salary of all SDEs: ");
        System.out.println(empList.stream().filter(emp -> "SDE".equals(emp.getRole())).map(Employee :: getSalary).reduce((num1,num2)-> (num1 + num2)).get());
        
        System.out.println("Dudes earning more than 400:");
        empList.stream().filter(emp -> emp.getSalary() > 400).forEach(System.out::println);

        System.out.println("Employee earning maximum salary: ");
        System.out.println(empList.stream().map(Employee ::getSalary).reduce((num1,num2)-> (num1 > num2 ? num1 : num2)).get());

        Collections.sort(empList, (Employee e1, Employee e2) -> e1.getEmpID() - e2.getEmpID());
        System.out.println(empList);

        Collections.sort(empList, (Employee e1, Employee e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
        System.out.println(empList);



    }
    
}
