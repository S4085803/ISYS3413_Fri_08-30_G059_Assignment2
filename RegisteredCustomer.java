
// Author: Saneli Ratnayake (s4085803)
// Author: Sowndharyaa (s4090884)
// Contribution: Registered Customer class 

public class RegisteredCustomer extends Customer {
    private String membershipNum;
    private int creditPoints;
    private String userName;

    public boolean redeemPoints(int points) {
        return false;
    }

    public String getTierLevel() {
        return "";
    }

    public String getUserName() {
        return userName;
    }
}
