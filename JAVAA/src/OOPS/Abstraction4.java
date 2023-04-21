package OOPS;

public class Abstraction4 extends Abstraction3 {

	@Override
	void sum() {
		System.out.println("sum is="+(a+b));      //implementation in child class
		
	}

	@Override
	void substraction() {
		System.out.println("substraction="+ c);
		
	}

	
	public static void main(String[] args) {
		Abstraction4 a1=new Abstraction4();
		
		//calling sum,substraction method===which is now normal method
		a1.sum();
		
		a1.substraction();
		
		//calling non abstract method
		a1.multply();
		

	}

	
}
