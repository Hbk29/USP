package OOPS;

public class Methodoverload1 {
	
	//same method name, para diffrent in their type or no.
	public void add(int x, int y)   //2 or more method having same name but diffrent parameter
	{
		System.out.println(x+y);
	}
	
	public void add(int x, int y, int z)  //it can take place in same as well as other class
	{
		System.out.println(x+y-z);
	}

	public static void main(String[] args) {
		
		Methodoverload1 m1=new Methodoverload1();
		m1.add(20, 10);
		m1.add(20,10, 5);

	}

}
