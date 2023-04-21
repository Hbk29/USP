package OOPS;

public abstract class Abstraction3 {
	
	int a=10;
	int b=20;
	int c=a-b;
	
	abstract void sum();    //abstaract method
	
	abstract void substraction();   //abstaract method
	
	public void multply() {
		System.out.println("multiplication=a*b");     //NON abstaract method
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
