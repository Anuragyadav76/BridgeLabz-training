class Vehicle {
    int maxSpeed;
    String fuelType;
    void displayInfo() {
        System.out.println("Speed: " + maxSpeed + " | Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

class Motorcycle extends Vehicle {
    boolean hasGear;
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Vehicle v[] = new Vehicle[3];
        Car c = new Car();
        c.maxSpeed = 180;
        c.fuelType = "Petrol";
        c.seatCapacity = 5;
        Truck t = new Truck();
        t.maxSpeed = 120;
        t.fuelType = "Diesel";
        t.loadCapacity = 10000;
        Motorcycle m = new Motorcycle();
        m.maxSpeed = 150;
        m.fuelType = "Petrol";
        m.hasGear = true;
        v[0] = c;
        v[1] = t;
        v[2] = m;
        for (Vehicle x : v) x.displayInfo();
    }
}
