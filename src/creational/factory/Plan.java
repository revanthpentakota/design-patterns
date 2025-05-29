package creational.factory;

public abstract class Plan {

    public double rate;

    abstract void setRate();

    public void calculateBill(int units) {
        System.out.println(this.rate * units);
    }
}
