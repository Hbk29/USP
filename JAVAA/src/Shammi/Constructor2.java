package Shammi;

public class Constructor2 extends Constructor1 {
	//parametrised constructor
	
	int a,b;
  
	public Constructor2(int a, String b)  //parametrised constructor==when object creats with para, these para stored in para function
	{
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) 
	{
		Constructor2 r=new Constructor2(100,"AJAY");//object creat n pass parameter
		
		//parametrised constructor also gets automatically called
        //when object is created and parameter passed in it.
		//this parameter stored in instance variable/parameter function
	}

}
