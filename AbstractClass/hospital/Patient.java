package hospital;

public abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDiagnosis() { return diagnosis; }

    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }

    public abstract double calculateBill();
}
