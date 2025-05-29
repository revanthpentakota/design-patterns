package creational.abstractfactory.factory;

import creational.abstractfactory.products.IButton;
import creational.abstractfactory.products.ITextBox;
import creational.abstractfactory.products.MacButton;
import creational.abstractfactory.products.MacTextBox;

public class MacFactory implements GUIFactory {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new MacTextBox();
    }
}
