package Third_Review;
public class CabInvoiceGenerator {
    public double calculateFare(Ride ride) {
        double fare = ride.distance * ride.category.costPerKm + ride.time * ride.category.costPerMinute;
        return Math.max(fare, ride.category.minimumFare);
    }
    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
}
