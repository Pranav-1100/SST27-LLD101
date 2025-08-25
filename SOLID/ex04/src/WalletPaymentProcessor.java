public class WalletPaymentProcessor implements IPaymentProcessor {
    @Override
    public String processPayment(double amount) {
        return "Wallet debit: " + amount;
    }
}