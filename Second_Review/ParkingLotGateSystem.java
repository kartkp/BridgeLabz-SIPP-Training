package Second_Review;

import java.util.Scanner;

public class ParkingLotGateSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = 5;
        int occupied = 0;

        while (true) {
            System.out.println("Menu: 1) Park  2) Exit Car  3) Show Occupancy  4) Quit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Car parked. Current occupancy: " + occupied + "/" + capacity);
                    } else {
                        System.out.println("Parking full!");
                    }
                    break;
                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Car exited. Current occupancy: " + occupied + "/" + capacity);
                    } else {
                        System.out.println("Parking is empty!");
                    }
                    break;
                case 3:
                    System.out.println("Current occupancy: " + occupied + "/" + capacity);
                    break;
                case 4:
                    System.out.println("Exiting Parking System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
            // System.out.println("------------------------------");
        }
    }
}
