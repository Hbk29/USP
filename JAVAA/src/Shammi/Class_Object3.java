//wap to create cricketr details
package Shammi;

class cricket{
	public String name;
	public int runs;
	public float price;
	
	public void para(String name, int run,float price  )    //para function
	{
		this.name=name;          //this keyword used to specify current object. 
		this.runs=run;
		this.price=price;
	}
	
	public void show() {
		System.out.println("players details="+name+"\t"+runs+"\t"+price);
	}
}
public class Class_Object3 {

	public static void main(String[] args) {
		cricket c1=new cricket();           //1st method
		c1.name="sachin";
		c1.runs=567;
		c1.price=3000.00f;
		
		c1.show();                        //calling non static method
		
		cricket c2=new cricket();          //2nd method
		c2.para("rahul",550, 2000.0f);     //calling para finction
		
		c2.show();                        //calling show method
		
		cricket c3=new cricket();
		c3.para("ajay",400,500.0f);
		
		c3.show();
		
		
		
		
		
		
		

	}

}
