package behavioral.observer;

import behavioral.observer.observable.StockObservable;
import behavioral.observer.observable.concrete.StockObservableImpl;
import behavioral.observer.observer.concrete.EmailNotificationAlertObserver;
import behavioral.observer.observer.concrete.MobileNotificationAlertObserver;

/**
 *  Observer Design Pattern :
 *
 *      a. It is a behavioral design pattern used to create one to many dependency between
 *         objects so that when one object(the Subject) changes its state, all of its
 *         dependents(Observers) are notified and updates automatically.
 *
 *   Components :
 *
 *      a. Subject   :  Subject maintains list of observers and notifies them of state changes.
 *      b. Observer  :  The Observer interface defines contract for concrete observer classes.
 *      c. Concrete Subject  :  A class that implements the subject interface and manages the
 *                              observers.
 *      d. Concrete Observer :  A class that implements the observer interface and receives the
 *                              notifications.
 */

public class ObserverTest {
    public static void main(String[] args) {
        StockObservable stockObservable = new StockObservableImpl("Chocolates", 12);
        stockObservable.registerObserver(new EmailNotificationAlertObserver("og@gmail.com"));
        stockObservable.registerObserver(new MobileNotificationAlertObserver("222777"));

        stockObservable.addStock(10);
        System.out.println();

        stockObservable.removeObserver(new MobileNotificationAlertObserver("222777"));
        stockObservable.registerObserver(new EmailNotificationAlertObserver("panja@hotmail.com"));

        stockObservable.addStock(20);
        System.out.println("The current stock is : " + stockObservable.getStockCount());
        stockObservable.removeStock(35);
        System.out.println("The current stock is : " + stockObservable.getStockCount());
    }
}
