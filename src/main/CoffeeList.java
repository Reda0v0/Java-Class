package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class CoffeeList {
	
	ArrayList<Coffee> list = new ArrayList<Coffee>();
	
	/**
	 * Une fonction pour remplir une liste
	 */
	public void AlimenterListe() {
		list.add(new Coffee("Espresso", true, 10, "Arabica", false));
		list.add(new Coffee("Latte", false, 10, "Arabica", false));
		list.add(new Coffee("Espresso", true, 10, "Robusta", true));
	}
	
	/**
	 * Fonction AfficherListe permet de parcourir la liste et afficher
	 * les c ligne par ligne
	 */
	public void AfficherListe() {
		for(Coffee cf : list) {
			System.out.println(cf);
		}
	}
	
	/**
	 * Fonction ParcourirListe permet de parcourir la liste et afficher
	 * les c ligne par ligne.
	 * la difference ici c'est que on a utiliser un iterator
	 * iterator => est une interface utilisée pour parcourir des collections 
	 * comme ArrayList et HashSet. Il permet de parcourir les éléments un par un
	 */
	public void ParcourirListe() {
		Iterator<Coffee> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	/**
	 * Cette fonction prend on parametre une variable de type c puis il ajoute a la list
	 * @param c
	 */
	public void insererUnElement(Coffee c) {
		list.add(c);
	}
	
	/**
	 * Cette fonction prend on parametre une variable de type c et elle a comme type de retour c
	 * si cette element n'est pas dans la list il va retourner une valeur null sinon il va le recuperer
	 * @param c
	 * @return
	 */
	public Coffee recupererUnElement(Coffee c) {
		if(list.contains(c))
			return c;
		return null;
	}
	
	/**
	 * Cette fonction Java qui a un type de retour boolean permet de supprimer un élément de la liste
	 * il verifie si la c exicte dans la liste 
	 * si il ne trouve pas la c il va rien supprimer on retourne flase
	 * sinon on supprime l'element
	 * @param c
	 * @return
	 */
	public boolean supprimerUnElement(Coffee c) {
		if(!list.contains(c)) return false;
		
		return list.remove(c);
	}
	
	/**
	 * Cette fonction Java qui permet de rechercher un élément on retourn True 
	 * s'il exicte et false s'il n'exicte pas
	 * @param c
	 * @return
	 */
	public boolean rechercherUnElement(Coffee c) {
		if(list.contains(c)) return true;
		return false;
	}
	
	/**
	 * Cette fonction Java qui permet de trier la liste
	 */
	public void trierListe() {
		Collections.sort(list);
	}
	
	/**
	 * Codez une fonction Java qui permet de copier la liste dans un nouveau tableau.
	 */
	public void copieListeDanstableau() {
		Coffee[] tableauc = new Coffee[list.size()];
		for(int i=0;i<list.size();i++)
			tableauc[i]=list.get(i);
	}
	
	/**
	 * Cette fonction Java qui permet de mélanger les élément de la liste
	 * La méthode shuffle() retourne des résultats différents après chaque exécution
	 */
	public void melangerLesElEment() {
		Collections.shuffle(list);
	}
	
	/**
	 * Cette fonction Java qui permet d’inverser les éléments de la liste
	 */
	public void inverserLesElements() {
		Collections.reverse(list);
	}
	
	/**
	 * Cette fonction Java qui permet d’extraire une partie de la liste.
	 */
	public void extraireUnePartie() {
		list.subList(0, list.size()/2);
	}
	
	/**
	 * Cette fonction Java qui permet de comparer deux list.
	 */
	public boolean comparerDeuxListe(List<Coffee> ls) {
		return this.list.equals(ls);
	}
	
	/**
	 * Cette fonction Java d'échange de deux éléments dans une liste
	 * Pour remplacer une valeur existante à une position spécifique dans ArrayList en java, 
	 * utilisez la méthode set() de la classe ArrayList.
	 */
	public void echangeDeuxElements(Coffee v1, Coffee v2) {
		list.set(0, v1);
		list.set(list.size()-1, v2);
	}
	
	/**
	 * Cette fonction Java qui permet de vider la liste
	 */
	public void viderListe() {
		list.clear();
	}
	
	/**
	 * Cette fonction Java qui permet de tester que la liste est vide ou non
	 * !list.isEmpty() si la liste n'est pas vide (means "if the list is not empty.")
	 * @return
	 */
	public boolean checkListeVide() {
		if(!list.isEmpty()) return false;
		return true;
	}	
}