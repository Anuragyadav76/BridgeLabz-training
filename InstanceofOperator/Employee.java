package InstanceofOperator;

class Employee {
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName + ", ID: " + id + ", Name: " + name + ", Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Anurag", "Developer");
        Employee e2 = new Employee(2, "Rohit", "Tester");
        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}

