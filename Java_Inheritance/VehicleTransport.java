package Java_Inheritance;

class Vehicle {
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println(seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;
    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println(loadCapacity);
    }
}

class Motorcycle extends Vehicle {
    String type;
    Motorcycle(int maxSpeed, String fuelType, String type) {
        super(maxSpeed, fuelType);
        this.type = type;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println(type);
    }
}

public class VehicleTransport {
    public static void main(String[] args) {
        Car c = new Car(180, "Petrol", 5);
        Truck t = new Truck(120, "Diesel", 10000);
        Motorcycle m = new Motorcycle(150, "Petrol", "Sport");
        c.displayInfo();
        t.displayInfo();
        m.displayInfo();
    }
}

