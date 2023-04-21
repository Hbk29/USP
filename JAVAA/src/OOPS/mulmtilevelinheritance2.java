package OOPS;

public class mulmtilevelinheritance2 extends multilevelinheritance1{
	//father extends grandpa
	String dept="mech";
	int salary=25000;
	
	public void show() {
		System.out.println("all details="+id+"\t"+name+"\t"+weight+"\t"+dept+"\t"+salary);
	}

	public static void main(String[] args) {
	
		mulmtilevelinheritance2 m2=new mulmtilevelinheritance2();
		
		m2.show();

	}

}
