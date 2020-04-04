import java.io.*;
public class EmployeeTest {
    public static void main(String args[]){
        /* Create tow objects using constructor */
        Employee emp1 = new Employee("James");
        Employee emp2 = new Employee("Mary");

        // Invoking methods for each object created

        emp1.empAge(26);
        emp1.empDesignation("engineer");
        emp1.empSalary(1000);
        emp1.printEmployee();

        emp2.empAge(21);
        emp2.empDesignation("front end engineer");
        emp2.empSalary(2000);
        emp2.printEmployee();        
    }
}