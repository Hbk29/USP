package ExceptionHandling;

public class Exception1 {

	public static void main(String[] args) {
		/* Exception is an event which terminate the program excution.
		 * Techquie of handling exception is called Exception handling
		 * Following keywords are used while handling exception
		 * 1.Try===Try block encloses the code which might throw the exception
		 * 2.catch===catch block describes the reason or class of that exception.
		 * Always catch block comes after the try block
		 * 3.finally===finally block always excuted whether exception handled or not.
		 * fianlly block comes after try block or try-catch block
		 * 4.throw===it is used to handle single exception
		 * 5.throws===it is used to handle multiple exceptions.
		 */
		
		
		//                       Iterator   (super class)
        //         ERROR                                               EXCEPTION
        //                                           Checked Exception            Unchecked Exception
		//       
		//         1.Assertion error                 1.FileNotFound Exception      1.Arithmatic Exception 
		//        2.Out of memeory error             2.ClassNotFound Exception     1.ArrayIndexOutOfBond Exception 
		//                                            3.IO Exception                1.Null pointer Exception 
	    //                                           4.Interrupted Exception        1.Class cast Exception 
	    //                                           5.SQL Exception                1.Number Form Exception 
	
	         //All exceptions are class(Starting with UPPERCASE LETTERS)
		     //cHECKED Exception===compileTime Exception
	         //Unchecked Exception===RunTime Exception
	}

}
