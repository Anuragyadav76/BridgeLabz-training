class Employee {
    String name;
    int id;
    double salary;
    void displayDetails() {
        System.out.println(name + " | ID: " + id + " | Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String duration;
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Amit";
        m.id = 101;
        m.salary = 80000;
        m.teamSize = 10;
        m.displayDetails();

        Developer d = new Developer();
        d.name = "Ravi";
        d.id = 102;
        d.salary = 60000;
        d.programmingLanguage = "Java";
        d.displayDetails();

        Intern i = new Intern();
        i.name = "Sita";
        i.id = 103;
        i.salary = 20000;
        i.duration = "3 Months";
        i.displayDetails();
    }
}

