package DesignPrinciple;
import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    List<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    String companyName;
    List<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Company comp = new Company("Tech Corp");

        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Anurag"));
        d1.addEmployee(new Employee("Ramesh"));

        Department d2 = new Department("HR");
        d2.addEmployee(new Employee("Sita"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompany();

        // If company is destroyed → departments & employees vanish too
        comp = null;  
    }
}

