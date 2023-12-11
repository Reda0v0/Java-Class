package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import main.Coffee;

public class CoffeeTable {
	
	Coffee[] list = new Coffee[3];

	
	 public CoffeeTable() {
		 list[0] = new Coffee("Espresso", true, 10, "Arabica", false);
		 list[1] = new Coffee("Latte", false, 10, "Arabica", false);
		 list[2] = new Coffee("Espresso", true, 10, "Robusta", true);
		 
	 }
	 
	 public boolean existe(Coffee ct) {
			for(Coffee c:list) {
				if(c.equals(ct)) return true;
			}
			return false;
		}
	 
	 public void trier(Comparator<Coffee> cmpv) {
		 Arrays.sort(list,cmpv);
	 }
	 
	 
	 public void ajouter(Coffee vtr) {
			
				ArrayList<Coffee> listlist = new ArrayList<Coffee>(Arrays.asList(list));
				listlist.add(vtr);
				list = listlist.toArray(new Coffee[listlist.size()]);
	
		}
	 
	 public boolean supprimer(Coffee vtr) {
			if(!this.existe(vtr)) return false;
			
			ArrayList<Coffee> liste = new ArrayList<Coffee>(Arrays.asList(list));
			liste.remove(vtr);
			list = liste.toArray(new Coffee[liste.size()]);
			return true;
			
		}
	 
	 public int nbrelement() {
		 return list.length;
	 }
	 
	 
	 public void inverser() {
			ArrayList<Coffee> liste = new ArrayList<Coffee>(Arrays.asList(list));
			Collections.reverse(liste);
			list = liste.toArray(new Coffee[liste.size()]);
		}
	 
	 public void afficher() {
		 for(int i=0;i<list.length;i++) {
			 System.out.println(list[i]);
		 }
		 
	 }
	 
	 public Coffee Maxprice() {
			Arrays.sort(list, new CmpPrice());
			return list[list.length-1];
		}
	 
	 public boolean egalite(Coffee[] emps) {
			return Arrays.equals(emps,list);
		}
	 
	 
		
	

}
