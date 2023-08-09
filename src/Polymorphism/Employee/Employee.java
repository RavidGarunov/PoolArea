package Polymorphism.Employee;

public class Employee {


    public static void main(String[] args) {

        Employee employee =  new Employee();

        employee.calculateSalary();

        Employee employee1 = new Manager();

        employee1.calculateSalary();

        Employee employee2 = new Programmer();

        employee2.calculateSalary();

    }


    public void calculateSalary() {

        System.out.println("Salary of employee");

    }
}
