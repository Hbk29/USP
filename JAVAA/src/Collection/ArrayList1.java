package Collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
	ArrayList<String>  players=new ArrayList<String>();
	
	// ARR====we have 3 method Add,Remove,Replace(SET)
	 
	//ADD ELEMENT
	players.add("sachin");
	players.add("Virendra");
	
	System.out.println(players);
	
	//ADD WITH iNDEX
	players.add(1, "SAURAV");
	System.out.println(players);
	
	players.add("rahul");
	players.add("yuvraj");
	players.add("vvs");
	
	System.out.println(players);
	
	players.add(2,"dhoni");
	System.out.println(players);      //dhoni added at index 2 
	
	//REMOVE ELEMENT(by index)
	players.remove(6);   //vvs
	System.out.println(players);
	
	//REPLACE ELEMENT 
	players.set(1,"kaif");
	System.out.println(players);     //saurav replaced by kaif
	
	//total size of collection
	System.out.println(players.size());
	
	//get index method
	System.out.println(players.get(4));  //rahul
	


	}

}
