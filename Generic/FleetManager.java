import java.util.*;
class Vehicle { String name; Vehicle(String n){ name=n; } public String toString(){return name;} }
class Truck extends Vehicle { Truck(String n){super(n);} }
class Bike extends Vehicle { Bike(String n){super(n);} }
class FleetManager<T extends Vehicle> {
    List<T> fleet = new ArrayList<>();
    void addVehicle(T v){ fleet.add(v); }
    void showFleet(){ for(T v:fleet) System.out.println(v); }
    public static void main(String[] args){
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck("Tata Truck"));
        trucks.showFleet();
        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike("Hero Bike"));
        bikes.showFleet();
    }
}