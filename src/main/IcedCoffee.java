package main;

public class IcedCoffee extends Coffee {
    private int temperature;

    public IcedCoffee(String type, boolean isDecaf, double price, String blend, boolean isGrounded, int temperature) {
        super(type, isDecaf, price, blend, isGrounded);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", temperature=" + temperature;
    }
}
