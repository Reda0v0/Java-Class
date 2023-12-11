package main;
import java.util.*;

public class iced_Cofeee extends Coffee implements Comparable<Coffee> {
	 
	private String icedCoffeeStrength;
	private int temperature; 

	public iced_Cofeee(String type, boolean isDecaf, double price, String blend, boolean isGrounded,String icedCoffeeStrength, int temperature) {
		super(type,isDecaf,price,blend,isGrounded);
		this.icedCoffeeStrength = icedCoffeeStrength;
		this.temperature = temperature;
	}

	public String getIcedCoffeeStrength() {
		return icedCoffeeStrength;
	}

	public void setIcedCoffeeStrength(String icedCoffeeStrength) {
		this.icedCoffeeStrength = icedCoffeeStrength;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return super.toString()+ " icedCoffeeStrength=" + icedCoffeeStrength + ", temperature=" + temperature ;
	}

    @Override
    public int compareTo(Coffee otherCoffee) {
        if (otherCoffee instanceof iced_Cofeee) {
        	iced_Cofeee otherIcedCoffee = (iced_Cofeee) otherCoffee;
            return this.icedCoffeeStrength.compareTo(otherIcedCoffee.getIcedCoffeeStrength());
        } else {
            return super.compareTo(otherCoffee);
        }
    }

}
