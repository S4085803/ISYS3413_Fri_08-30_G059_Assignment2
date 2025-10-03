// Author: Sowndharyaa (s4090884)
// Contribution: Flight class

import java.util.List;

public class Flight {
    private String flightID;
    private String airlineName;
    private String departureTime;
    private String arrivalTime;
    private int duration;
    private float price;
    private int numOfStops;
    private List<String> stopoverLocations;
    private String flightType; // "Domestic/International"
    private FlightDetails flightDetails; //association 

    //sample
    public int calculateDuration() {
        // Placeholder
        return 0;
    }

    public int calculateFlightTicket() {
        // Placeholder
        return 0;
    }
}
