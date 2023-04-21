//wap to create 2 employee records from variable
package Shammi;

class employee{
	int id;            //declaring variable===non static
	String name;
	String dept;
	float weight;
}
public class ClassObject1 {

	public static void main(String[] args) {
		
		employee e1=new employee();      //object craetion
		
		e1.id=505;                      //defining variable
		e1.name="ajay";
		e1.dept="mech";
		e1.weight=55.5f;
		
		System.out.println("all details="+e1.id+"\t"+e1.name+"\t"+e1.dept+"\t"+e1.dept);
		
		employee e2=new employee();
		e2.id=605;
		e2.name="vijay";
		e2.dept="electric";
		e2.weight=65.5f;
		System.out.println("all details="+e2.id+"\t"+e2.name+"\t"+e2.dept+"\t"+e2.weight);
		
		

	}

}
