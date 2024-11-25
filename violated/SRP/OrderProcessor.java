// God class doing too many things.
public void processOrder(Order order) {
        // Validate order.
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have at least one item.");
        }

        // Calculate tax.
        double tax = order.getTotalAmount() * 0.05; // 5% GST.

        // Generate bill.
        double totalAmount = order.getTotalAmount() + tax;
        System.out.println("Order Summary:");
        System.out.println("Items: " + order.getItems());
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + totalAmount);
    }
}