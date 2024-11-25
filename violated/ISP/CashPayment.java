// CashPayment doesn't handle card payments but must implement them.
public class CashPayment implements PaymentHandler {
    @Override
    public void processCardPayment(double amount) {
        throw new UnsupportedOperationException("Invalid Type.");
    }

    @Override
    public void processCashPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
    }
}