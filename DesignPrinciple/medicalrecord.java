package DesignPrinciple;

class InPatient extends Patient {
    private in
}






abstract class Patient implements medicalrecord {



    List <Patient> records=new ArrayList<>();
    public Patient( int PatientID, String name, int age, ){
        this.PatientID=PatientID;
        this.name=name;
        this.age=age;
    }
    public Patient(int PatientID, String Name, int Age, boolean medicalrecord){
        this.PatientID=PatientID;
        this.name=name;
        this.age=age;
        this.medicalrecord=medicalrecord;

    
    }
    public int getPatientID() { return PatientID; }
}
