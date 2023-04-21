package OOPS;

public class Methodoverload3 extends Methodoverload2{

	//method overloading can takes place same as well as child class
	public void colour( String color, String h, String v) {
		System.out.println("colour is="+color+" "+h+" "+v );
	}
	public static void main(String[] args) {
		Methodoverload3 m3=new Methodoverload3();
		
		m3.colour("black");  //parent class
		
		m3.colour("black","white"); //parent class
		
		m3.colour("pink","blue","red");   //child class
		
		

	}

}
