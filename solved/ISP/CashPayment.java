// Only implement the specific needed interface.
public class CashPayment implements CashInterface {
    @Override
    public void processCardPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
    }
}