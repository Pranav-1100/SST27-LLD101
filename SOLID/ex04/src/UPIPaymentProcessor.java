public class UPIPaymentProcessor implements IPaymentProcessor {
    @Override
    public String processPayment(double amount) {
        return "Paid via UPI: " + amount;
    }
}