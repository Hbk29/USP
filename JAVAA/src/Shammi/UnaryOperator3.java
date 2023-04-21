package Shammi;

public class UnaryOperator3 {

	public static void main(String[] args) {
		// a    ++      +      ++     a        //4 componant

		int a=10;
		int b=20;
		
		
		System.out.println(a++ + ++a );     //10,11  +    12,12 ==== 10+12=22
		System.out.println(a + ++a );     //12  +    13,23 ==== 12+13=25
		System.out.println(b-- + ++a );     //20,19  +    14,24 ==== 20+14=34
		System.out.println(++a + --b );     //25,25  +    18,18 ==== 25+18=33
		System.out.println(a - --a );     //25  -    24,24==== 25-24=1
		
	}

}
