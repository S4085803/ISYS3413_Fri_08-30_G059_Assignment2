// Author: Sowndharyaa (s4090884)
// Contribution: Flight details class - includes the seat,meal,baggage options

public class BookingOptions {
 private String flightID;
 private String aircraftType;
 private String seatSelection;
 private String mealChoice;
 private int baggageCount;

 
 public BookingOptions(String seatSelection, String mealChoice, int baggageCount) {
     this.seatSelection = seatSelection;
     this.mealChoice = mealChoice;
     this.baggageCount = baggageCount;
 }

 // Getters - returning the values
 public String getSeatSelection() { return seatSelection; }
 public String getMealChoice() { return mealChoice; }
 public int getBaggageCount() { return baggageCount; }
}
