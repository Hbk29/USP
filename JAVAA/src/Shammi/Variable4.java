package Shammi;

public class Variable4 {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5};   //WE CAN STORE MULTIPLE VALUES IN SINGLE UNIT IN CONTINOUS MEMORY LOCATION
	
	int[]b= {4,5,6,7,8,9};
	
	String c[]= {"ajay", "vijay", "sanjay"};
	
	String []d= {"mahesh", "GANESH", "VIGHNESH"};
	
	System.out.println(a[1]);  //2
	System.out.println(b[2]);  //6
	System.out.println(c[2]);  //sanjay
	System.out.println(d[1]);  //ganesh
	
	Object s[]= {10,20,"sanjay","akshay"};   //
	System.out.println(s[1]);   //20
	
	System.out.println(s[2]);   //sanjay

	}

}
