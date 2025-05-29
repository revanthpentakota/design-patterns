package creational.singleton;

/**
 *  As we used volatile keyword, the object is always retrieved from the
 *  RAM instead from cache.
 *
 *  Once the connObject is created, the other threads will not be synchronized
 *  for null checks unlike synchronized lazy initialization, that will reduce
 *  synchronization overhead.
 *
 *  i.e., if T1 created connObject, T2, T3, T4... incoming threads
 *  no need to wait since connObject is already made available by T1.
 *
 */

public class DoubleCheckedLocking {

    public volatile static DatabaseConnection connObject;

    private DoubleCheckedLocking(){}

    public static DatabaseConnection getSingletonInstance() {
        if (connObject == null) {
            synchronized (DatabaseConnection.class) {
                return new DatabaseConnection();
            }
        }
        return connObject;
    }

}
