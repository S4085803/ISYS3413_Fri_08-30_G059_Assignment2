// Author: Saneli Ratnayake (s4085803)
// Contribution: Vehicle class 

public class Vehicle {
    protected String vehicleNum;
    protected String model;
    protected double ratePerDay;

    public boolean isBookable(java.util.Date start, java.util.Date end) {
        return false;
    }

    public double calculateFee(int days) {
        return 0.0;
    }
}
