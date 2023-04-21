package OOPS;

public class Inheritance4 extends Inheritance3 {
  
	public void multiply(int x, int y)  //user defined non static method from child class
	{
		System.out.println("multiply="+ (x*y));
	}
	public static void main(String[] args) {
		
		Inheritance4 i4=new Inheritance4 ();
		
		//calling non static method with ref of object
		i4.add();
		i4.substract(20, 5);
		
		//child class non static method
		i4.multiply(5, 5);

	}

}
