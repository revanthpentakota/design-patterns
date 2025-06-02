package behavioral.observer.observable.concrete;

import behavioral.observer.observable.StockObservable;
import behavioral.observer.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class StockObservableImpl implements StockObservable {
    private String productName;
    private int  stockCount;
    private List<NotificationAlertObserver> observers = new ArrayList<>();

    public StockObservableImpl(String productName, int stockCount) {
        this.productName = productName;
        this.stockCount = stockCount;
    }

    @Override
    public void registerObserver(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int stockCount) {
        for (NotificationAlertObserver obs : observers) {
            obs.update(stockCount);
        }
    }

    @Override
    public void addStock(int newStockAdded) {
        this.stockCount += newStockAdded;
        if (this.stockCount <= 25) {
            notifyObservers(stockCount);
        }
    }

    @Override
    public void removeStock(int stockRemoved) {
        if (this.stockCount >= stockRemoved) this.stockCount -= stockRemoved;
        if (this.stockCount <= 25) {
            notifyObservers(stockCount);
        }
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }

}
