
// Author: Saneli Ratnayake (s4085803)
// Contribution: Registered Customer class 

public class RegisteredCustomer extends Customer {
    private String membershipNum;
    private int creditPoints;

    public boolean redeemPoints(int points) {
        return false;
    }

    public String getTierLevel() {
        return "";
    }
}
