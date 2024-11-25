// Broad interface (payment methods will not use all of the functions).
public interface PaymentInterface {
    void processCardPayment(double amount); // For card payments.
    void processCashPayment(double amount);  // For cash payments.
}