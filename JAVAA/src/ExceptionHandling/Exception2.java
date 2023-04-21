package ExceptionHandling;

public class Exception2 {
                      
	public static void main(String[] args) {
		//try block==code which might throw exceptoion
               try 
               {
				int a=10/0;         //posiible code of exception
			   } 
               
         //catch==class of exception      
               catch (Exception e)
               {
				
				e.printStackTrace();    //info ==line no. and class of exception
			   }    
	
               //if exception not handled further program not excute==its terminate
	     
               System.out.println("end of program");
	}

}
