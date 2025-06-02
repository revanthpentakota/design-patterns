package behavioral.strategy.concrete;

import behavioral.strategy.PaymentStrategy;

public class SamsungPayPayment implements PaymentStrategy {
    private String name;
    private String emailId;
    private String upiId;
    private String password;

    public SamsungPayPayment(String name, String emailId, String upiId, String password) {
        this.name = name;
        this.emailId = emailId;
        this.upiId = upiId;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Samsung Pay.");
    }
}
