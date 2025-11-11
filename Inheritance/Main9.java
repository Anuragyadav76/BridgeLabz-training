class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String subject;
    void displayRole() {
        System.out.println(name + " teaches " + subject);
    }
}

class Student extends Person {
    String grade;
    void displayRole() {
        System.out.println(name + " studies in grade " + grade);
    }
}

class Staff extends Person {
    String department;
    void displayRole() {
        System.out.println(name + " works in " + department + " department");
    }
}

public class Main9 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Ramesh";
        t.subject = "Math";
        Student s = new Student();
        s.name = "Anurag";
        s.grade = "3rd Year";
        Staff st = new Staff();
        st.name = "Suresh";
        st.department = "Administration";
        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
