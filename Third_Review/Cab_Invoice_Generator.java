package Third_Review;
public class Cab_Invoice_Generator {
    public static void main(String[] args) {
        InvoiceService invoiceService = new InvoiceService();

        
        Ride[] rides = {
            new Ride(2.0, 5, RideCategory.NORMAL),
            new Ride(0.1, 1, RideCategory.NORMAL),
            new Ride(3.0, 10, RideCategory.PREMIUM)
        };

        invoiceService.addRides("user1", rides);
        InvoiceSummary summary = invoiceService.getInvoice("user1");

        System.out.println(summary);
    }
}
