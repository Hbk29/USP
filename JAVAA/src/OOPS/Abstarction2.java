package OOPS;

public class Abstarction2 extends Abstraction1 {
	
	@Override  //override abstract method, after oveeride abstract keyword gone
	void eat()
	{
		System.out.println("i am eating"); //its normal method after override, we can implement here
		
	}


	public static void main(String[] args) {
		Abstarction2 ref=new Abstarction2();
		
		ref.eat();    //calling implemented  method.
		
		//calling non abstract method
		ref.drink();
		
		//calling non static variable
		System.out.println(ref.a);
		System.out.println(ref.b);
	}

	
}
