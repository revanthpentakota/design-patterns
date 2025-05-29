package creational.abstractfactory.products;

public class WinButton implements IButton {

    @Override
    public void render() {
        System.out.println("Rendering Win Button.");
    }
}
