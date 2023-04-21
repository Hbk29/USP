package ExceptionHandling;

public class Exception3 {

	public static void main(String[] args) {
		// we can use multiple catch block in case of we dont know exception class
        
		//try block==code which might throw exceptoion
        try 
        {
			int a=10/0;         
		   } 
        
    
        catch (Exception e)
        {
			
			System.out.println(e);    //info== class of exception
		   }   

        //if exception not handled further program not excute==its terminate
  
        System.out.println("end of program");
	}

}
