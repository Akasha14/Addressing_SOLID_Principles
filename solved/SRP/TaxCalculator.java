// One Resposiblity.
public class TaxCalculator {
    public double calculateTax(Order order) {
        return order.getTotalAmount() * 0.05; // 5% GST calculation.
    }
}