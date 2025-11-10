package hospital;

import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;
    private List<String> records;

    public InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return records;
    }
}
