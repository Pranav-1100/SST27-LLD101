public class CardPaymentProcessor implements IPaymentProcessor {
    @Override
    public String processPayment(double amount) {
        return "Charged card: " + amount;
    }
}