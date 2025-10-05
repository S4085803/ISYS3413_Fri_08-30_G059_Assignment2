import java.util.List;

public class VehicleService {
    private VehicleRepository repo = new VehicleRepository();

    // check search details
    public ValidationResult validate(Criteria c) { return null; }

    // find cars
    public List<Vehicle> findVehicles(Criteria c) { return null; }

    // total price
    public PriceQuote computeTotal(String vehicleId, List<Extra> extras) { return null; }

    // put car on hold
    public String hold(String vehicleId, List<Extra> extras, Customer customer) { return null; }

    // confirm booking
    public String confirm(String holdRef) { return null; }

    // release hold
    public void release(String holdRef) { }
}
