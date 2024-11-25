// One Resposiblity.
public class BillGenerator {
    public void generateBill(Order order, double tax) {
        double totalAmount = order.getTotalAmount() + tax;
        System.out.println("Order Summary:");
        System.out.println("Items: " + order.getItems());
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + totalAmount);
    }
}