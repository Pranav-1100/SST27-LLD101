public class ShippingCostCalculator {
    public double cost(Shipment shipment) {
        IShippingStrategy strategy = ShippingStrategyFactory.getStrategy(shipment.type);
        return strategy.calculateCost(shipment.weightKg);
    }
}
