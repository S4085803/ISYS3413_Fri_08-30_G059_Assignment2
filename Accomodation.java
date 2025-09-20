// Author: Dithara [s4056824]
// Accomodation Process 

public class Accomodation{
    String AccomoId;
    String AccomoType;
    double AccomoNghtlyRate;
    String Accomolocation;    //city
    int Accomocapacity;       // no of guests
    double Accomorating;      // average rating of the acomodation

    public boolean isAvailable(java.util.Date startDate, java.util.Date endDate) {
        return false;
    }

    public double calculateCostAccomo(int nights) {
        return 0.0;
    }

    public String getLocationAccomo() {
        return "";
    }

    public int getCapacityAccomo() {
        return 0;
    }

    public double getAccomoRatings() {
        return 0.0;
    }
}