package OOPS;

public class HirarchicalInheritance2 extends  HierarchicalInheritance {
	
	public void b() {
		System.out.println("u r dancer");
	}

	public static void main(String[] args) {
		
		HirarchicalInheritance2 h2=new HirarchicalInheritance2();
		
		h2.a();
		
		h2.b();
	}

}
