import java.util.List;

public class VehicleController {
    private VehicleService service = new VehicleService();

    // search cars

    public void searchVehicles(Criteria criteria) { }

    // check car and extras

    public PriceQuote review(String vehicleId, List<Extra> extras) { return null; }

    // hold car before payment

    public String createHold(String vehicleId, List<Extra> extras, Customer customer) { return null; }

    // confirm booking

    public PaymentResult confirm(String holdRef) { return null; }

    // release hold if fail
    
    public void release(String holdRef) { }
}
