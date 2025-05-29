package creational.abstractfactory.products;

public class WinTextBox implements ITextBox {
    @Override
    public void display() {
        System.out.println("Displaying Win Textbox.");
    }
}
