package main;
import java.util.*;

public class FlavoredCoffee extends Coffee implements Comparable<Coffee> {
    private String flavor;

    public FlavoredCoffee(String type, boolean isDecaf, double price, String blend, boolean isGrounded, String flavor) {
        super(type, isDecaf, price, blend, isGrounded);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public int compareTo(Coffee otherCoffee) {
        if (otherCoffee instanceof FlavoredCoffee) {
            FlavoredCoffee otherFlavoredCoffee = (FlavoredCoffee) otherCoffee;
            return this.flavor.compareTo(otherFlavoredCoffee.getFlavor());
        } else {
            return super.compareTo(otherCoffee);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", flavor=" + flavor;
    }
    
    
}

