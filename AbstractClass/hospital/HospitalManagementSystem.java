package hospital;

import java.util.*;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient(101, "Amit Sharma", 45, "Fever", 5, 1500);
        p1.addRecord("Admitted to Ward A");
        p1.addRecord("Blood test and X-Ray done");

        OutPatient p2 = new OutPatient(102, "Riya Verma", 30, "Cold & Cough", 600);
        p2.addRecord("Consulted Dr. Mehta");
        p2.addRecord("Medication prescribed");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: Rs. " + p.calculateBill());
            System.out.println("Medical Records:");
            if (p instanceof MedicalRecord) {
                for (String record : ((MedicalRecord)p).viewRecords()) {
                    System.out.println("- " + record);
                }
            }
            System.out.println("--------------------------------");
        }
    }
}
