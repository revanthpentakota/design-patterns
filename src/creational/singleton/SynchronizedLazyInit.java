package creational.singleton;

/**
 *
 *  Since the getSingletonInstance method is synchronized, only one thread can
 *  access the method and create an instance.
 *
 *  This is Thread-safe.
 *
 *  Issues :
 *  1. Its adds synchronization overhead and reduces performance.
 */

public class SynchronizedLazyInit {

    private static DatabaseConnection connObject;

    private SynchronizedLazyInit(){}

    public static synchronized DatabaseConnection getSingletonInstance() {
        if (connObject == null) {
            return new DatabaseConnection();
        }
        return connObject;
    }
}
