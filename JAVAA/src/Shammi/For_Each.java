package Shammi;

public class For_Each {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		
		for(int b:a) {
			System.out.println(b);
		}
		
		String c[]= {"shammi","isoft","technogreeks"};
		
		for (String d:c)
		{
			System.out.println(d);
		}
		
		Object f[]= {1,2,3,"hbk","hhh"};
		
		for(Object e:f) 
		{
			System.out.println(e);
		}

	}

}
