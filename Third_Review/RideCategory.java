package Third_Review;
public enum RideCategory {
    NORMAL(10, 1, 5),
    PREMIUM(15, 2, 20);

    public final int costPerKm;
    public final int costPerMinute;
    public final int minimumFare;

    RideCategory(int costPerKm, int costPerMinute, int minimumFare) {
        this.costPerKm = costPerKm;
        this.costPerMinute = costPerMinute;
        this.minimumFare = minimumFare;
    }
}
