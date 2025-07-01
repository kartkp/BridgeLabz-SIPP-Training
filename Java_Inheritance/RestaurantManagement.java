package Java_Inheritance;

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    String speciality;
    Chef(String name, int id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }
    public void performDuties() {
        System.out.println(name + " " + id + " prepares " + speciality);
    }
}

class Waiter extends Person implements Worker {
    int tablesAssigned;
    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }
    public void performDuties() {
        System.out.println(name + " " + id + " serves " + tablesAssigned + " tables");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Chef c = new Chef("Raj", 1, "Indian Cuisine");
        Waiter w = new Waiter("Sam", 2, 5);
        c.performDuties();
        w.performDuties();
    }
}

