public class OrderRepository implements IOrderRepository {
    @Override
    public void save(String customerEmail, double total) {
        System.out.println("Order stored (pretend DB).");
    }
}