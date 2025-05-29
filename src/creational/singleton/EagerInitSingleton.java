package creational.singleton;

/**
 *
 *  Singleton Pattern
 *
 *  1. Ensures that class has only one instance and provides global
 *     point of access to that instance.
 *
 *  Uses :
 *
 *  a. To manage shared resources, such as config setting, logging, caching etc.
 *  b. Saves memory as object is created only once not per request.
 */

public class EagerInitSingleton {

    // Object created at the time of declaration.
    public static DatabaseConnection connObject =
                                new DatabaseConnection();

    // since constructor is private, can't create an object with new keyword.
    private EagerInitSingleton(){
    }

    // returns the object that is created.
    public static DatabaseConnection getConnObject() {
        return connObject;
    }
}
