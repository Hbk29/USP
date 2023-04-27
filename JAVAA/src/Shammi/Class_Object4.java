package Shammi;

class Employee
{
	public int employee_id;
	public String employeename;
	public double salary;
	public String joindate;

	public void addEmployee(int empid, String empname, double sal, String join)
	{
		employee_id = empid;
		employeename = empname;
		salary = sal;
		joindate = join;
	}

	public void showEmployee()
	{
		System.out.println(String.format("%10d %20s %10.2f %20s", employee_id, employeename, salary, joindate));
	}
}


class ClassObjectEx3
{
	public static void main(String []args)
	{
		Employee a[] = new Employee[2];   //array oject
		
		a[0]=new Employee();
		a[0].addEmployee(100,"ajay",2000.00,"13/03/2020");
		
		a[1]=new Employee();
		a[1].addEmployee(200,"vijay", 30000.00,"25/09/2020");
		
		a[2]=new Employee();
		a[2].addEmployee(300,"sanjay",40000.00,"02/11/2020");
		
		for(int i=0;i<a.length;i++) {
			a[i].showEmployee();
		}
		
		

	

	}
}