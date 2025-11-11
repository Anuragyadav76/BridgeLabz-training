class Device {
    int deviceId;
    String status;
}

class Thermostat extends Device {
    int temperatureSetting;
    void displayStatus() {
        System.out.println("Device ID: " + deviceId + " | Status: " + status + " | Temperature: " + temperatureSetting);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.deviceId = 101;
        t.status = "ON";
        t.temperatureSetting = 24;
        t.displayStatus();
    }
}

