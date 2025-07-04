import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}
public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient ip = new InPatient("P101", "Alice", 30, 5, 2000);
        OutPatient op = new OutPatient("P102", "Bob", 45, 500);

        ip.addRecord("Admitted for surgery");
        ip.addRecord("Recovered well");

        op.addRecord("Consulted for fever");

        patients.add(ip);
        patients.add(op);

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Total Bill: " + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord) p;
                System.out.println("Medical Records: " + mr.viewRecords());
            }
            System.out.println();
        }
    }
}