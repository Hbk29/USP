//wa to input 2 book records
package Shammi;

public class Class_Object2 {
	
	int id;                       //non static variable
	String name;
	float price;
	String author;
	
	public void details()             //non static method
	{
		System.out.println(id+"\t"+name+"\t"+price+"\t"+author);
	}

	public static void main(String[] args) {
		
		Class_Object2 c2=new Class_Object2();   //object creation
		
		c2.id=100;                             //ref.variable=value
		c2.name="jay book";
		c2.price=50000f;
		c2.author="mr bakshi";
		
		Class_Object2 c3=new Class_Object2();
		 c3.id=200;
		 c3.name="ajay book";
		 c3.price=650.0f;
		 c3.author="mr. chatarjee";
		 
		 c2.details();           //calling non static method with the ref. of object
		 c3.details();
		
		
		

	}

}
