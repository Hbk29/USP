package Shammi;

public class UnaryOperaor1 {

	public static void main(String[] args) {
		// pre increment, post increment, pre decrement, post decrement,
       //++i  i++  --i  i--
		
		int i=1;
		                         //console value   //actual value saved in RAM
		System.out.println(i++);  //1                2
		
		System.out.println(i);    //2
		
		System.out.println(i++);  //2                3
		
		System.out.println(i);    //3
		
		//console prints value of i
		
		System.out.println(-- i);  //2               2
		
		System.out.println(++ i);  //3               3
		
		System.out.println(i --);  //3               2
		
		System.out.println(i);     //2
		
		
		
	}

}
