import java.util.List;

public class UI {
    private VehicleController controller = new VehicleController();

    // open the vehicles page

    public void openVehicles() {
        
    }

   // user enters search details

    public void enterCriteria(String location, String startDate, String endDate, String type) {
        Criteria c = new Criteria(location, startDate, endDate, type);
        controller.searchVehicles(c);
    }

    // show list of available cars 

    public void displayResults(List<Vehicle> results) { }


    public void showValidationErrors() { }

    public void showNoVehicles() { }

    public void bookingCancelled() { }

    public void showReview(PriceQuote quote) { }

    public void success(String bookingId) { }

    public void failure(String reason) { }
    
    public void showPaymentFailed(String reason) { }
}

