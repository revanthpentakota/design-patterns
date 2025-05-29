package creational.abstractfactory.factory;

import creational.abstractfactory.products.IButton;
import creational.abstractfactory.products.ITextBox;

public interface GUIFactory {
    IButton createButton();
    ITextBox createTextBox();
}
