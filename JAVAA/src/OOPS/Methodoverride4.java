package OOPS;

public class Methodoverride4 extends Methodoverride3 {
	
	public void run() {     //same method==same para...diffrent class
		System.out.println("we are runnimg");
	}

	
	public static void main(String[] args) {
		
	Methodoverride4	 m4=new Methodoverride4();   //result of child class
	m4.run();
	
	Methodoverride3	 m3=new Methodoverride3();   //result of parent class
	m3.run();

	}

}
