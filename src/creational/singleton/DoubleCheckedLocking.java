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
 *  If T2, T3 are waiting at synchronized block, after T1 releases lock then
 *  T2 might be creating another instance violating Singleton Pattern.
 *
 */

public class DoubleCheckedLocking {

    private volatile static DoubleCheckedLocking connObject;

    private DoubleCheckedLocking(){}

    public static DoubleCheckedLocking getSingletonInstance() {
        if (connObject == null) {
            synchronized (DoubleCheckedLocking.class) {
                return new DoubleCheckedLocking();
            }
        }
        return connObject;
    }

}
