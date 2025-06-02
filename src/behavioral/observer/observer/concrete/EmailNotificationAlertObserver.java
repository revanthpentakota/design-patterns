package behavioral.observer.observer.concrete;

import behavioral.observer.observer.NotificationAlertObserver;

import java.util.Objects;

public class EmailNotificationAlertObserver implements NotificationAlertObserver {

    private String email;

    public EmailNotificationAlertObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(int currentStockCount) {
        System.out.format("Hurry up! The current stock is %d. " +
                "Grab the opportunity before stock completes!!! \n", currentStockCount);
        System.out.println("Notification successfully sent to email :  " + this.email);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmailNotificationAlertObserver that = (EmailNotificationAlertObserver) o;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
