package Collection;

import java.util.LinkedHashSet;

public class LinkedHashset1 {

	public static void main(String[] args) {
		//shows reult as per insertion order
		//we dont have index method for add/remove, also we dont have set method
		
		
		 LinkedHashSet<String> p=new LinkedHashSet<String>();
		 
		 p.add("ajay");
		 p.add("vijay");
		 p.add("sanjay");
		 
		 System.out.println(p);
		 
		 p.add("kevin");
		 p.add("seth");
		 p.add("dean");
		 System.out.println(p); //[ajay,vijay,sanjay,kevin,seth,dean]==as per insertion

		 //remove directly by object
		 p.remove("seth");
		
		 System.out.println(p.contains("kevin"));
		 System.out.println(p.size());
	}

}
