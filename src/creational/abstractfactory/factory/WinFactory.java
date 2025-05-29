package creational.abstractfactory.factory;

import creational.abstractfactory.products.IButton;
import creational.abstractfactory.products.ITextBox;
import creational.abstractfactory.products.WinButton;
import creational.abstractfactory.products.WinTextBox;

public class WinFactory implements GUIFactory {
    @Override
    public IButton createButton() {
        return new WinButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WinTextBox();
    }
}
