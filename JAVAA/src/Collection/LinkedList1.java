package Collection;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// ArrayList and Linked list has same methods
		
		LinkedList<String> hero=new LinkedList<String>();   //object of LinkedLIst class
		
		//add
		hero.add("srk");
		hero.add("salman");
		hero.add("amir");
		
		System.out.println(hero);
		
		//add with index
        hero.add(0,"rajesh");
        hero.add(1,"amitabh");
        
		System.out.println(hero);
		
		//replace
		hero.set(0,"DILIP");     //rajesh replaced by dilip
		
		System.out.println(hero);
		
		//remove
		hero.remove(1);   //amitabh
		System.out.println(hero);
		
		System.out.println(hero.get(0));
		System.out.println(hero.size());
		
		System.out.println(hero.getFirst());
		
		System.out.println(hero.getLast());
		
		//contains() used for checking element present or not
		System.out.println(hero.contains("amitabh"));
		
		

	}

}
