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

    public static class DatabaseSingletonHelper{
        public static final DatabaseConnection DATABASE_CONNECTION =
                new DatabaseConnection();
    }

    public static DatabaseConnection getSingletonInstance() {
        return DatabaseSingletonHelper.DATABASE_CONNECTION;
    }
}
