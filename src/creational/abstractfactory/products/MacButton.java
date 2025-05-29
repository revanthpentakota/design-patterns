package creational.abstractfactory.products;

public class MacButton implements IButton {
    @Override
    public void render() {
        System.out.println("Rendering Mac Button.");
    }
}
