package Constructors;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void displayDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", Specialization: " + specialization);
    }

    public static void main(String[] args) {
        PostgraduateStudent p = new PostgraduateStudent(101, "Anurag", 8.5, "AI");
        p.display();
        p.displayDetails();
        p.setCGPA(9.0);
        System.out.println("Updated CGPA: " + p.getCGPA());
    }
}

