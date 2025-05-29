package creational.abstractfactory.products;

public class MacTextBox implements ITextBox {

    @Override
    public void display() {
        System.out.println("Displaying the Mac Textbox.");
    }
}
