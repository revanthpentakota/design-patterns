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
 *
 *  Issues :
 *
 *  a. Object gets created when class is loaded, so object is created even if it
 *     is not used that leads to memory waste
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
