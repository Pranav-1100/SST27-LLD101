
public class Demo01 {
    public static void main(String[] args) {
        IEmailService emailService = new EmailService();
        ITaxService taxService = new TaxService();
        IOrderRepository orderRepository = new OrderRepository();
        
        OrderService orderService = new OrderService(emailService, taxService, orderRepository);
        orderService.checkout("a@shop.com", 100.0);
    }
}
