public class PST_Tax implements TaxRule {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.07; // British Columbia's 7% PST Tax.
    }
}