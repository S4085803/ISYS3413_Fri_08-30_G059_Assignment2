//details for searching vehicles

public class Criteria {
    public final String pickupLocation;
    public final String pickupDate;
    public final String endDate;
    public final String vehicleType;

    public Criteria(String location, String startDate, String endDate, String type) {
        this.pickupLocation = location;
        this.pickupDate = startDate;
        this.endDate = endDate;
        this.vehicleType = type;
    }
}
