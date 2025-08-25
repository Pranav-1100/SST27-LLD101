public class SqlOrderRepository implements IOrderRepository {
    @Override
    public void save(String orderId) {
        System.out.println("Saved order " + orderId + " to SQL");
    }
}
