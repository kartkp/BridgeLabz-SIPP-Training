package Day4_Methods;

public class UnitConverter {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println("5 km to miles: " + convertKmToMiles(5));
        System.out.println("3 miles to km: " + convertMilesToKm(3));
        System.out.println("2 meters to feet: " + convertMetersToFeet(2));
        System.out.println("6 feet to meters: " + convertFeetToMeters(6));
    }
}
