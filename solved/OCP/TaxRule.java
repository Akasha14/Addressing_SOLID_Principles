// TaxRule interface allows addition of taxes dynamically,
// without changing the calculateTax method.
// *Open for extension but closed for modification*
public interface TaxRule {
    double calculateTax(double amount);
}