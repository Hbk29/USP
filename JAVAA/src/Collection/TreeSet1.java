package Collection;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// as per ascending order
		
		TreeSet<Integer> i=new TreeSet<>();
		
		i.add(6);
		i.add(4);
		i.add(2);
		i.add(0);
		System.out.println(i);  //[0,2,4,6]
		
		i.add(15);
		i.add(9);
		i.add(7);
		i.add(3);
		System.out.println(i);  //[0,2,3,4,6,7,9,15]
		
		i.remove(4);
		
		System.out.println(i.size());
		System.out.println(i.contains(6));
		
		System.out.println(i.first());     //0
		System.out.println(i.pollLast());  //15
		

	}

} 
