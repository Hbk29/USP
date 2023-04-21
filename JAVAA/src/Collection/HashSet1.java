package Collection;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		//no gurantee of oreder
		
		HashSet<Integer> ref=new HashSet<>();
		
		ref.add(5);
		ref.add(10);
		ref.add(15);
		
		System.out.println(ref);
		
		ref.add(20);
		ref.add(25);
		System.out.println(ref); //[20,5,25,10,15]===no guarantee of order
		
		//remove direct by object===we dont have index method for add/remove
		ref.remove(20);
		System.out.println(ref);
		
		System.out.println(ref.size());  //4
		
		//checking element present or not==reurns boolean
		System.out.println(ref.contains(10)); //true
		
		

	}

}
