class Student {
    String name;
    int rollNumber;
    double marks;

    void inputDetails(String n, int r, double m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else return "D";
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inputDetails("Anurag", 101, 85);
        s1.displayDetails();
    }
}

