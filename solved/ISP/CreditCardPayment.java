// Only implement the specific needed interface.
public class CreditCardPayment implements CardInterface {
    @Override
    public void processCardPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}