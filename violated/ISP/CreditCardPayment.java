// CreditCard doesn't handle cash payments but must implement it.
public class CreditCardPayment implements PaymentHandler {
    @Override
    public void processCardPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void processCashPayment(double amount) {
        // Irrelevant for credit card, forced to implement
        throw new UnsupportedOperationException("Invalid type.");
    }
}