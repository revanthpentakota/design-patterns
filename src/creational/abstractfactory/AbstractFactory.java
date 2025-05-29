package creational.abstractfactory;

import creational.abstractfactory.factory.GUIFactory;
import creational.abstractfactory.factory.WinFactory;

/**
 *  Abstract Factory Pattern:
 *
 *  a. It provides an interface for creating families of related or dependent
 *     objects without specifying concrete classes.
 *  b. It is like a factory of factories - a super factory that creates other factories.
 *
 *  Idea:
 *
 *  a. If you want to create a group of related objects (e.g. buttons + textboxes).
 *  b. The client should not care about the specific implementations. (Win or Mac).
 *  c. Ensures consistency across products of a single family.
 */
public class AbstractFactory {
    public static void main(String[] args) {
        GUIFactory winFactory = new WinFactory();
        ApplicationFactory applicationFactory = new ApplicationFactory(winFactory);
        applicationFactory.renderUI();
    }
}
