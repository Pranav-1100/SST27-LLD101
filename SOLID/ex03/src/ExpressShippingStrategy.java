public class ExpressShippingStrategy implements IShippingStrategy {
    @Override
    public double calculateCost(double weightKg) {
        return 80 + 8 * weightKg;
    }
}