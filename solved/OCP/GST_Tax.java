public class GST_Tax implements TaxRule {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.05; // Canadian 5% GST Tax.
    }
}