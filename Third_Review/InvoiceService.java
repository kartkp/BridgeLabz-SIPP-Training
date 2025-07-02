package Third_Review;

public class InvoiceService {
    private RideRepository rideRepository = new RideRepository();
    private CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    public void addRides(String userId, Ride[] rides) {
        rideRepository.addRides(userId, rides);
    }

    public InvoiceSummary getInvoice(String userId) {
        Ride[] rides = rideRepository.getRides(userId);
        return cabInvoiceGenerator.calculateFare(rides);
    }
}