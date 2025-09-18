
// Authors: Shared responsibility
// Contribution: Connects to external supplier APIs
import java.util.Date;
import java.util.List;

public class SupplierAdapter {
    private String providerName;
    private String apiAddress;

    public List getInventory(String type, String location, Date start, Date end) {
        return null;
    }

    public boolean confirmBooking(Booking booking) {
        return false;
    }
}

