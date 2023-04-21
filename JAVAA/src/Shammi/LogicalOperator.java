package Shammi;

public class LogicalOperator {

	public static void main(String[] args) {
		// Logical operator && (AND)
		//IF FIRST CONDITION IS FALSE, THEN IT DOES NOT CHECK 2nd CONDITION
		//It reurns BOOLEAN
		
		int a=10;
		int b=20;
		int c=30;
		
		System.out.println(a<b && b<c);    //True
		
		System.out.println(a>b && b<c);   //false ===it doesnt check 2nd cond.
		

		int q=5;
		int w=10;
		
		System.out.println(q==w && w>q);  //false
		
		System.out.println(w>q && q>w);  //false
		
		
		
	}

}
