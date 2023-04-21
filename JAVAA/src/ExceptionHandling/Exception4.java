package ExceptionHandling;

public class Exception4 {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		
		int c;
		
		try {
			c = a/b;
		} catch (Exception e) {
			System.out.println(e.getMessage());    //message
			System.out.println(e.getClass());      //class
			e.printStackTrace();                   //class line no
		}
		
		finally{
			System.out.println("forcefully excute the code");
		}

	}

}
