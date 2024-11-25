import java.util.List;

// TaxCalculator dynamically applies all tax rules.
public class TaxCalculator {
    private List<TaxRule> taxRules;

    //Constructor.
    public TaxCalculator(List<TaxRule> taxRules) {
        this.taxRules = taxRules;
    }

    public double calculateAmountWithTax(double amount) {
        double totalAmount = 0.0;
        for (TaxRule tax : taxRules) {
            totalAmount += tax.calculateTax(amount); // Use calculateTax from interface.
        }
        return totalTax;
    }
}