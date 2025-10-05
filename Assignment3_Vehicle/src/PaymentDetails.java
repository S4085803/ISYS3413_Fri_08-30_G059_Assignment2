// card details for payment

public class PaymentDetails {
    public final String cardNumber;
    public final String expiryDate;
    public final String cvv;

    public PaymentDetails(String cardNumber, String expiry, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiry;
        this.cvv = cvv;
    }
}
