import java.util.Scanner;

public class Employee
{

	int empno;
	String name;
	float sal;
	
	public Employee(int empno, String name, float sal)
	{
		
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}
	
//	void readEmpDetails()
//	{
//		Scanner s = new Scanner(System.in);
//		empno = s.nextInt();
//		name = s.next();
//		sal = s.nextFloat();
//	}
	
	void dispEmpDetails()
	{
		System.out.println(empno + name + sal);
	}
	
	
}
