import java.util.List;

//temporary booking beofre payment

public class BookingDraft {
    public final String vehicleId;
    public final List<Extra> selectedExtras;
    public final Customer bookingCustomer;

    public BookingDraft(String vehicleId, List<Extra> extras, Customer customer) {
        this.vehicleId = vehicleId;
        this.selectedExtras = extras;
        this.bookingCustomer = customer;
    }
}
