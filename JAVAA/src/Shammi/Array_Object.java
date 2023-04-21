package Shammi;

public class Array_Object {
	
	int id;
	String name;
	String sname;
	
	public void a(int id, String name, String sname) {
		this.id=id;
		this.name=name;
		this.sname=sname;
		}
	
	public void b() {
		System.out.println("all="+this.id+"\t"+this.name+"\t"+this.sname);
	}

	public static void main(String[] args) {
		
		Array_Object b[]=new Array_Object [3];
		
		b[0]=new Array_Object();
		b[0].a(500,"rey","animal");
		
		b[1]=new Array_Object();
		b[1].a(800,"hbk","hhh");
		
		b[2]=new Array_Object();
		b[2].a(700,"taker","kane");
		
		b[0].b();
		b[1].b();
		b[2].b();
		
		
	
	}

}
