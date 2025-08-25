public interface IOrderRepository {
    void save(String customerEmail, double total);
}