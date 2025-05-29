package creational.factory;

/**
 *  Factory Design Pattern:-
 *
 *  a.  Define an interface or abstract class for creating an object, but
 *      let subclasses decide which class to instantiate.
 *  b.  Promotes loose coupling between client code and concrete classes.
 *
 *  This pattern takes out the responsibility of creation of object from client
 *  class to the factory class.
 */
public class FactoryTest {

    public static void main(String[] args) {
        GetPlanFactory planFactory = new GetPlanFactory();
        Plan plan = planFactory.getPlan("Domestic");
        plan.setRate();
        plan.calculateBill(5);
    }
}
