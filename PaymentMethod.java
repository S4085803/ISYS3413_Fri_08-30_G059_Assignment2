
// Authors: Shared responsibility
// Contribution: Payment method class for common booking flow

public class PaymentMethod {
    private String secureNum;
    private String providerName;

    public boolean validate() {
        return false;
    }

    public String displayLabel() {
        return "";
    }
}
