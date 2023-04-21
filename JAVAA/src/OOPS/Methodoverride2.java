package OOPS;

public class Methodoverride2 extends Methodoverride1{
	
	@Override  //right click==sourcr==ovverride method
	public void c(int a, int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
	Methodoverride2 m2=new Methodoverride2();   //child class
	
	m2.c(10, 3);
	
	Methodoverride1 m1=new Methodoverride1(); //parent class
	m1.c(10,10);
	

	}

}
