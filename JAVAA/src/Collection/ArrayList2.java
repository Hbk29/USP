package Collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> no=new ArrayList();
		
		//add
		no.add(5);
		no.add(10);
		no.add(15);
		
		System.out.println(no);//[5,10,15]
		
		//add with index
		no.add(1,8);   //[5,8,10,15]
		
		no.add(2, 12); //[5,8,12,10,15]
		
		System.out.println(no.size());   //5
		
		System.out.println(no.get(1));   //8
		
		no.add(20);
		System.out.println(no);        //[5,8,12,10,15,20]
		
		//remove 8
		no.remove(1);
		
		System.out.println(no);       //[5,12,10,15,20]
		
		
		//replace 2nd index=10
		no.set(2,50);
		System.out.println(no);   //[5,12,50,15,20]
		
		//get index
		System.out.println(no.get(0));  //5
	}

}
