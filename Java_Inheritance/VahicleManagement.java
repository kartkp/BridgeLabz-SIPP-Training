package Java_Inheritance;

interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle {
    int batteryCapacity;
    ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }
    void charge() {
        System.out.println(model + " charging with " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity;
    PetrolVehicle(int maxSpeed, String model, int fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }
    public void refuel() {
        System.out.println(model + " refueling with " + fuelTankCapacity + " litres");
    }
}

public class VahicleManagement{
    public static void main(String[] args) {
        ElectricVehicle e = new ElectricVehicle(150, "Tesla Model 3", 75);
        PetrolVehicle p = new PetrolVehicle(180, "Honda City", 40);
        e.charge();
        p.refuel();
    }
}
