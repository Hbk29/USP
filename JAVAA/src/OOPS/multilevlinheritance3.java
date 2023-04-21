package OOPS;

public class multilevlinheritance3 extends mulmtilevelinheritance2 {
	//son extends father
	
	String dob="25.01.1995";
	
	public void show1() {
		System.out.println("all details="+id+"\t"+name+"\t"+weight+"\t"+dept+"\t"+salary+"\t"+dob);
	}

	public static void main(String[] args) {
		multilevlinheritance3 m3=new multilevlinheritance3();
		
		//calling non static method of this class
		m3.show1();
		
		//inherit the property of child class===multilevelinheritance2
        m3.show();
		
        //by default we can inherit property of parent class==multilevelinheritance1
        //son can extends property of grandpa
		System.out.println(m3.id);
        System.out.println(m3.name);
	}

}
