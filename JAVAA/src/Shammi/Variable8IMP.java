package Shammi;

public class Variable8IMP {
	int a=10;     //global variable
	static int b=20;  //static variable
	
	public static void a() {                 //static method
		System.out.println("a method");
	}
	
	public void b() {                     //non static method
		System.out.println("non static method");
	}
	

	public static void main(String[] args) {
		//non static variable a, we need to call non static a variable into main method
		//by object creation  clasname ref= new classname();
		
		Variable8IMP ref=new Variable8IMP();    //object creation statement
		
		System.out.println(ref.a);
	    
		//calling static variable
		System.out.println(b);
		
		System.out.println(Variable8IMP.b);
		
		System.out.println(ref.b);
		
		//there is one method for non static and 3 method for static
		
		//calling method
		ref.a();
		
		a();
		
		ref.b();
	
		

	}

}
