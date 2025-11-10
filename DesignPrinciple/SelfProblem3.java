package DesignPrinciple;

import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting patient " + p.name);
    }
}

class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }
}

public class SelfProblem3 {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. A");
        Doctor d2 = new Doctor("Dr. B");

        Patient p1 = new Patient("Anurag");
        Patient p2 = new Patient("Rahul");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}

