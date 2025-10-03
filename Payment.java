
// Authors: Shared responsibility
// Contribution: Payment class for common booking 

public class Payment {
    private String receiptNum;
    private double amount;
    private String payStatus;
    private String method;

    public boolean authorise() {
        return false;
    }

    public boolean refund() {
        return false;
    }
}

//Author: Sowndharyaa (s4090884)
//Contribution: Simulates external payment processing

public class PaymentGateway {

 public boolean processPayment(String paymentInfo) {
     // Placeholder: Simulate payment logic
     if (paymentInfo != null && !paymentInfo.isEmpty()) {
         System.out.println("Payment successful.");
         return true;
     }
     System.out.println("Payment failed.");
     return false;
 }
}


