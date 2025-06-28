package Java_ObjectModeling;

// import java.util.ArrayList;

class Patient {
    String name;
    Patient(String n) { name = n; }
}

class Doctor {
    String name;
    Doctor(String n) { name = n; }

    void consult(Patient p) {
        System.out.println(name + " is consulting " + p.name);
    }
}

class Hospital {
    String name;
    Hospital(String n) { name = n; }
}

public class TestHospital {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Mehta");
        Patient p = new Patient("Anjali");

        d.consult(p);
    }
}

