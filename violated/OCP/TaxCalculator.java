// Cannot add new tax types without changing the calculateTax method.
// *Not open for extension without modification.*
public class TaxCalculator {
    public double calculateTax(Order order) {
        double tax = 0;

        // Canadian 5% GST Tax.
        if ("GST".equals(order.getTaxType())) {
            tax = order.getTotalAmount() * 0.05;
        }
        // British Columbia's 7% PST Tax.
        else if ("PST".equals(order.getTaxType())) {
            tax = order.getTotalAmount() * 0.07;
        }

        return tax;
    }
}