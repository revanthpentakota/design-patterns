package creational.abstractfactory;

import creational.abstractfactory.factory.GUIFactory;
import creational.abstractfactory.products.IButton;
import creational.abstractfactory.products.ITextBox;

public class ApplicationFactory {

    private IButton button;
    private ITextBox textBox;

    public ApplicationFactory(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        textBox = guiFactory.createTextBox();
    }

    public void renderUI() {
        button.render();
        textBox.display();
    }
}
