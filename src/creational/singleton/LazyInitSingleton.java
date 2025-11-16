package creational.singleton;

/**
 *  Lazy initialization creates the object only when it is required
 *  unlike Eager initialization where the object gets created when
 *  class is loaded.
 *
 *  This is not Thread-safe.
 *
 *  Issues :
 *  a. If threads T1, T2 access that getSingletonInstance method at same
 *     time, they might create two instances of singleton, which violates
 *     singleton pattern requirement.
 */

public class LazyInitSingleton {

    private static LazyInitSingleton connObject;

    private LazyInitSingleton(){
    }

    public static LazyInitSingleton getSingletonInstance() {
        if (connObject == null) {
            return new LazyInitSingleton();
        }
        return connObject;
    }
}
