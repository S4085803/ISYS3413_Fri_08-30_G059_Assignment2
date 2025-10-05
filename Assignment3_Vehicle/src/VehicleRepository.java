import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {
    
    public List<Vehicle> availableVehicles(Criteria c) {
        return new ArrayList<>(); 
    }

    // find by id
    public Vehicle findById(String id) { return null; }

    // create hold
    public String createHold(BookingDraft draft) { return null; }

    // save booking
    public String persistBooking(String holdRef) { return null; }

    // delete hold
    public void deleteHold(String holdRef) { return; }
}
