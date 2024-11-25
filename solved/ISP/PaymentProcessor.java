// Accepts the correct interface (CardInterface or CashInterface) depending on the type of payment.
public class PaymentProcessor {
    public void processPayment(CardInterface cardHandler, double amount) {
        cardHandler.processCardPayment(amount); // Handles card payments.
    }

    public void processPayment(CashInterface cashHandler, double amount) {
        cashHandler.processCashPayment(amount); // Handles cash payments.
    }
}