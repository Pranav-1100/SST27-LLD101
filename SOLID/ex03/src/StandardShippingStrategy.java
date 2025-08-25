public class StandardShippingStrategy implements IShippingStrategy {
    @Override
    public double calculateCost(double weightKg) {
        return 50 + 5 * weightKg;
    }
}