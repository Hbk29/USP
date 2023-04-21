package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateList {

	public static void main(String[] args) {
		LinkedList<String> hero=new LinkedList<String>();       
		
		        //add
				hero.add("srk");
				hero.add("salman");
				hero.add("amir");
				
	         	//add with index
		        hero.add(0,"rajesh");
		        hero.add(1,"amitabh");
		      
				
				//1st method==for loop
				for(int i=0;i<hero.size();i++)
				{
					System.out.println("total heroes="+hero.get(i));
				}
				
				//2nd method ==each loop
				for(String b:hero)
				{
					System.out.println("all hero="+b);
				}

				//3rd method
				Iterator<String> it=hero.iterator();
				System.out.println(it.next());
				
	}

}
