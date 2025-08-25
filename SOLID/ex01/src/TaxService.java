public class TaxService implements ITaxService {
    private double taxRate = 0.18;
    
    @Override
    public double calculateTax(double subtotal) {
        return subtotal * taxRate;
    }
}