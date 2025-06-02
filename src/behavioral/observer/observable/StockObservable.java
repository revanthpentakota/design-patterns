package behavioral.observer.observable;

import behavioral.observer.observer.NotificationAlertObserver;

public interface StockObservable {
    void registerObserver(NotificationAlertObserver observer);
    void removeObserver(NotificationAlertObserver observer);
    void notifyObservers(int stockCount);
    void addStock(int newStockAdded);
    void removeStock(int stockRemoved);
    int getStockCount();
}
