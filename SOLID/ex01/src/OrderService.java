public class OrderService {
    private IEmailService emailService;
    private ITaxService taxService;
    private IOrderRepository orderRepository;
    
    public OrderService(IEmailService emailService, ITaxService taxService, IOrderRepository orderRepository) {
        this.emailService = emailService;
        this.taxService = taxService;
        this.orderRepository = orderRepository;
    }
    
    public void checkout(String customerEmail, double subtotal) {
        double tax = taxService.calculateTax(subtotal);
        double total = subtotal + tax;
        
        emailService.send(customerEmail, "Thanks! Your total is " + total);
        orderRepository.save(customerEmail, total);
    }
}