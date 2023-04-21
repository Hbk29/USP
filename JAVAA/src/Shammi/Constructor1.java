package Shammi;

public class Constructor1 {
	
	String name="ajay";
	int a=5;
	
	//default constructor
	public Constructor1() {
		System.out.println("default construcor");
	}
	
	//parameterised constructor
	public Constructor1(String name, int a) {
		System.out.println("value"+(name+" "+a));
	}

	public static void main(String[] args) {
		//constructor is special member function/method
		//constructor are used to initialiase the object
		//2 tpes of constructor==1. default constructor  2==parameterised constructor
		//constructor gets automatically called when object is created.
		//constructor name must be same as class name.
		//constructor doesnot have return type
		//constructor can be overloaded.
		//para constructor==Object create and pass para in it. then it stored in instance variable.
		
		Constructor1 ref=new Constructor1();
		
		//default constructor gets automatically called when object is created
		
		Constructor1 k=new Constructor1("ajay",200);
		

	}

}
