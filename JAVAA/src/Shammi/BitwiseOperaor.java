package Shammi;

public class BitwiseOperaor {

	public static void main(String[] args) {
		//Bitwise operator & (OR)
		// Bitwise operator check both cond, even first cond is false
		//it returns Boolean
		//true false=false, false true=false true true= true
		
		int a=10;
		int b=20;
		
		System.out.println(a>b & b>a);    //false
		
		int o=10;
		int p=20;
		int c=30;
		
		System.out.println(o>p & p==c & c>p);   //false
		
		//comapre bitwise in relational operator=Both return boolean
		//bitwise ==== true false=false
		//relational==== true false=true

	}

}
