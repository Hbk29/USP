package OOPS;

public class Methodoverload2 {
	//method overload can takes place child class also;
	String color= "BLUE";
	public void colour( String color) {
		System.out.println("colour is="+color );
	}
	
	public void colour( String color, String h) {
		System.out.println("colour is="+color+" "+h );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
