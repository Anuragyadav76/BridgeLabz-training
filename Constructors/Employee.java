package Constructors;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    void display() {
        System.out.println("ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String team;

    Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    void displayDetails() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Team: " + team);
    }

    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 60000, "AI Team");
        m.display();
        m.displayDetails();
        m.setSalary(70000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}

