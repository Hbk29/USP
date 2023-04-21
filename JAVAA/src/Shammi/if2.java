package Shammi;

public class if2 {

	public static void main(String[] args) {
		String a="isoft";
		
		String b="isoft";
		
		//1st 
		if(a==b)
		{
			System.out.println("both are same");
		}
		
		//2nd 
		//String methods
		if(a.equalsIgnoreCase(b)) {
			System.out.println("both are equal");
		}
		
		//3rd
      //false statement
		if(a!=b)    //false ====not excute
		{
			System.out.println("a and b are same");
		}
	}

}
