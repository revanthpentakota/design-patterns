package behavioral.strategy;

import behavioral.strategy.concrete.SamsungPayPayment;

/**
 *  Strategy Design Pattern :
 *
 *      a. It allows you to define a family of algorithms, encapsulates each one as a separate
 *         class, make them interchangeable.
 *      b. This means that a client (that uses the algorithm) can choose which algorithm to use
 *         at runtime without modifying the code.
 *
 *   In Essence, it lets you :
 *
 *      a. Define a family of algorithms   : Create multiple ways to perform same task.
 *      b. Encapsulate each algorithm      : Wrap each algorithm in its own class.
 *      c. Make algorithms interchangeable : The client can switch between algorithms dynamically.
 *      d. Decouple client from algorithm  : Client doesn't know specific implementation of the algorithm.
 *
 *   Structure :
 *
 *      a. Strategy Interface   :  Define common interface for supported algorithms and client uses
 *                                 this interface to call desired algorithm.
 *
 *      b. Concrete Strategies  :  Implement Strategy interface and each concrete strategy provides
 *                                 its own implementation of the algorithm.
 *
 *      c. Context              :  Maintains reference to strategy and delegates the execution of the
 *                                 algorithm to the associated strategy.
 */

public class StrategyClient {
    public static void main(String[] args) {
        ShoppingCartContext cart = new ShoppingCartContext();
        cart.addItem(new Item("1234", 250.36));
        cart.addItem(new Item("1249", 300.12));
        cart.addItem(new Item("9876", 5019.98));

        cart.setPaymentStrategy(new SamsungPayPayment("revanth",
                "sairev123@gmail.com", "revi496@pingpay", "rev@777"));

        cart.checkout();
    }
}
