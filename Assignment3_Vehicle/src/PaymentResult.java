//result of payment

public class PaymentResult {
    public final PaymentStatus status;
    public final String paymentToken;
    public final String failureReason;

    public PaymentResult(PaymentStatus status, String token, String reason) {
        this.status = status;
        this.paymentToken = token;
        this.failureReason = reason;
    }
}
