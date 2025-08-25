public class OrderController {
    private IOrderRepository repository;
    
    public OrderController(IOrderRepository repository) {
        this.repository = repository;
    }
    
    public void create(String id) {
        repository.save(id);
        System.out.println("Created order: " + id);
    }
}