package behavioral.strategy.concrete;

import behavioral.strategy.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    private String creditCardNumber;
    private String name;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPayment(String creditCardNumber, String name, String cvv, String dateOfExpiry) {
        this.creditCardNumber = creditCardNumber;
        this.name = name;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card.");
    }
}
