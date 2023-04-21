package Collection;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// Stack works on LIFO==LAST IN FIRST OUT
		//it has same methos in arraylist
		
		//PPP===PUSH, POP
		
		Stack<String> a=new Stack();
		
		//add=push
		a.push("horse");
		a.push("elephant");
		a.push("lion");
		
		System.out.println(a);
		
		//remove last
		a.pop();                
		System.out.println(a);  
		
	    a.set(0, "zebra");
	
	    System.out.println(a);
	   
	    a.remove(1);
	    System.out.println(a);
		
		
		
	

	}

	
	
}
