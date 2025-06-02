package behavioral.observer.observer.concrete;

import behavioral.observer.observer.NotificationAlertObserver;

import java.util.Objects;

public class MobileNotificationAlertObserver implements NotificationAlertObserver {

    private String phoneNumber;

    public MobileNotificationAlertObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(int currentStockCount) {
        System.out.format("Hurry up! The current stock is %d. " +
                "Grab the opportunity before stock completes!!! \n", currentStockCount);
        System.out.println("Notification successfully sent to phone number :  " + this.phoneNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MobileNotificationAlertObserver that = (MobileNotificationAlertObserver) o;
        return Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(phoneNumber);
    }
}
