interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;
}

class ElectricVehicle extends Vehicle {
    void charge() {
        System.out.println(model + " is charging");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public void refuel() {
        System.out.println(model + " is refueling");
    }
}

public class Main11 {
    public static void main(String[] args) {
        ElectricVehicle e = new ElectricVehicle();
        e.model = "Tesla";
        e.charge();
        PetrolVehicle p = new PetrolVehicle();
        p.model = "Honda";
        p.refuel();
    }
}

