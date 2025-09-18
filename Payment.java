
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

