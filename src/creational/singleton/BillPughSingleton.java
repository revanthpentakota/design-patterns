package creational.singleton;

/**
 *  a. Using inner static class, we can achieve synchronization without
 *     using volatile or synchronized keyword.
 *  b. Here inner static class is loaded  and its instance is created only when
 *     getSingletonInstance method is called, by default the classloader mechanism
 *     in java is thread safe.
 */

public class BillPughSingleton {

    public BillPughSingleton(){}

    public static class SingletonHelper{
        private static final BillPughSingleton INSTANCE =
                new BillPughSingleton();
    }

    public static BillPughSingleton getSingletonInstance() {
        return SingletonHelper.INSTANCE;
    }
}
