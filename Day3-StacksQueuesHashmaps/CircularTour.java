public class CircularTour {

    static class PetrolPump {
        int petrol;
        int distance;
        PetrolPump(int p, int d) {
            petrol = p;
            distance = d;
        }
    }

    public static int findStartPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        int start = 0, deficit = 0, balance = 0;

        for (int i = 0; i < n; i++) {
            balance += pumps[i].petrol - pumps[i].distance;
            if (balance < 0) {
                start = i + 1;
                deficit += balance;
                balance = 0;
            }
        }

        return (balance + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };
        int startPoint = findStartPoint(pumps);
        if (startPoint != -1)
            System.out.println("Start at pump: " + startPoint);
        else
            System.out.println("No solution possible");
    }
}
