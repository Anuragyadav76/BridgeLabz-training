package InstanceofOperator;

class Vehicle {
    private static double registrationFee = 1500;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Reg No: " + registrationNumber + ", Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("UP70AA1234", "Anurag", "Car");
        Vehicle v2 = new Vehicle("UP62BB5678", "Rahul", "Bike");
        v1.displayDetails();
        v2.displayDetails();
        Vehicle.updateRegistrationFee(2000);
        v1.displayDetails();
    }
}
