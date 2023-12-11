package main;

import java.util.Comparator;

public class CmpPrice implements Comparator<Coffee> {
	
	public int compare(Coffee o1, Coffee o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getPrice()-o2.getPrice()); //return soit une valeur positive ou negative ou 0
	}

}
