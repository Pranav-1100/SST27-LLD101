public class OvernightShippingStrategy implements IShippingStrategy {
    @Override
    public double calculateCost(double weightKg) {
        return 120 + 10 * weightKg;
    }
}