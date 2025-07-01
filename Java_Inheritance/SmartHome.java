package Java_Inheritance;

class Device {
    String deviceId;
    String status;
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    void displayStatus() {
        System.out.println(deviceId + " " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;
    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    void displayStatus() {
        super.displayStatus();
        System.out.println(temperatureSetting);
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("TH001", "ON", 24);
        t.displayStatus();
    }
}
