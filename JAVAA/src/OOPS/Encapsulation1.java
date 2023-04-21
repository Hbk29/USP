package OOPS;

public class Encapsulation1 {
	
	int a=10;
	int b=20;
	int c=a+b;
	
	public void w() {
		System.out.println("sum="+c);
	}

	public static void main(String[] args) {
		// Encapsulation is technique where we wrapp the code into single unit
		//Object creation statement is best ex. of Encapsulation

		Encapsulation1 e1=new Encapsulation1();
		e1.w();            //wrapp the code in single unit;
		
		
	}

}
