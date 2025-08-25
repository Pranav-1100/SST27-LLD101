public class PaymentProcessorFactory {
    public static IPaymentProcessor getProcessor(String provider) {
        switch (provider) {
            case "CARD":
                return new CardPaymentProcessor();
            case "UPI":
                return new UPIPaymentProcessor();
            case "WALLET":
                return new WalletPaymentProcessor();
            default:
                throw new RuntimeException("No provider for: " + provider);
        }
    }
}