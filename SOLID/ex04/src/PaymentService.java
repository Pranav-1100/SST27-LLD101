
public class PaymentService {
    public String pay(Payment payment) {
        IPaymentProcessor processor = PaymentProcessorFactory.getProcessor(payment.provider);
        return processor.processPayment(payment.amount);
    }
}