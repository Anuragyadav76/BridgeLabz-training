package DesignPrinciple;

import java.util.*;

class CourseU {
    String name;
    Professor professor;
    List<StudentU> students = new ArrayList<>();

    CourseU(String name) {
        this.name = name;
    }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println(p.name + " assigned to " + name);
    }

    void enrollStudent(StudentU s) {
        students.add(s);
        System.out.println(s.name + " enrolled in " + name);
    }

    void showCourse() {
        System.out.println("Course: " + name);
        if (professor != null) System.out.println("Professor: " + professor.name);
        for (StudentU s : students) {
            System.out.println(" - " + s.name);
        }
    }
}

class StudentU {
    String name;

    StudentU(String name) {
        this.name = name;
    }

    void enrollCourse(CourseU c) {
        c.enrollStudent(this);
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(CourseU c) {
        c.assignProfessor(this);
    }
}

public class SelfProblem5 {
    public static void main(String[] args) {
        StudentU s1 = new StudentU("Anurag");
        StudentU s2 = new StudentU("Rahul");

        Professor p1 = new Professor("Dr. Sharma");

        CourseU c1 = new CourseU("DSA");

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        p1.assignCourse(c1);

        c1.showCourse();
    }
}
m