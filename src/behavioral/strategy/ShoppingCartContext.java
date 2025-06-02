package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

class Item {
    private String id;
    private double price;

    public Item(String id, double price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}

// Context
public class ShoppingCartContext {

    List<Item> items;

    private PaymentStrategy paymentStrategy;   // Reference to the strategy

    public ShoppingCartContext() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public double calculateTotal() {
        double sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    // Setter for the strategy - allows changing strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Delegates the payment operation to the currently set strategy
    public void checkout() {
        if (paymentStrategy == null) {
            System.out.println("No Payment Strategy selected.");
            return;
        }
        double amount = calculateTotal();
        paymentStrategy.pay(amount); // delegates to the chose n strategy

    }

}
