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

    public int calculateDuration() {
    	//Duration to be calculated 
        // Placeholder
        return 0;
    }
    
    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getFlightID() {
        return flightID;
    }

    //Price of the flight ticket
    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
  
}
