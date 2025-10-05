public class PaymentGateway {
   //authorize payment
   
    public PaymentResult authorize(String holdRef, PaymentDetails details) {
        return new PaymentResult(PaymentStatus.APPROVED, "tok_demo", null);
    }
}
