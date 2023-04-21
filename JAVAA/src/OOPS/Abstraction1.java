
 /*abstraction is a process of hiding implementation and shows only functionility
 
#abstraction can be achieved by 2 ways==1. using abstract class , 2. using Interface

#1.using abstract class===it has abstract keyword with the class
 abstact class is partial abstarction(upto 100%),
 which means it has both abstarct method and also non abstract method
 #abstarct method has abstarct keyword before return type.
 There is no body for abstarct method.(no body ==no implementation,hide implementation)
 #Abstarct methods implementation done in the non abstarct class(normal class) by using inheritance.
 #we need to override abstarct method in that class, where we can shows its implementation.
 we need to create object of non abstract class and calling override abstract method by help of ref.
  
  Non abstract method is normal method(without abstarct keyword).
  
  very IMP NOTE= WE CAN NOT CREATE OBJECT OF ABSTARCT CLASS AND INTERFACE
 
 /*
 /*
  *  
  */
  //

package OOPS;


public abstract class Abstraction1 {
	
	int a=10;
	int b=20;
	String c="hbk";
	
	//abstarct method
	abstract void eat();                      //abstarct method===abstarct keyword before void, no body.

	//no abstarct method   
	public void drink() {                    //having body and implementation
		System.out.println("i am drinking");
	}
	
	public static void main(String[] args) {
		

	}

}
