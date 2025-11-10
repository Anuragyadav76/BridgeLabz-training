package DesignPrinciple;


import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Faculty: " + name);
    }
}

class DepartmentU {
    String deptName;

    DepartmentU(String deptName) {
        this.deptName = deptName;
    }

    void show() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    String name;
    List<DepartmentU> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(DepartmentU d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (DepartmentU d : departments) d.show();
        System.out.println("Faculties:");
        for (Faculty f : faculties) f.show();
    }
}

public class SelfProblem2 {
    public static void main(String[] args) {
        University uni = new University("GLA University");

        DepartmentU d1 = new DepartmentU("CSE");
        DepartmentU d2 = new DepartmentU("ECE");

        Faculty f1 = new Faculty("Prof. Sharma");
        Faculty f2 = new Faculty("Prof. Gupta");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();

        // Composition → If uni deleted, depts also vanish
        uni = null;
    }
}
