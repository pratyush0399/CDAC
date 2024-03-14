import java.util.Scanner;

public class EmployeeManagement 
{

	public Employee[] createEmp() 
	{
		Employee[] e = new Employee[2];
     
		Scanner s = new Scanner(System.in);
		for(int i = 0;i<e.length;i++)
		{
			e[i]= new Employee(s.nextInt(),s.next(),s.nextFloat());
			
					
		}
		
		return e;
		
	}

	public void dispEmp(Employee[] e) 
	{
		System.out.println("display Emp array");
		
		for(int i = 0;i<e.length;i++)
		{
			
					
			e[i].dispEmpDetails();	
		}
		
		
	}

	public void updateEmp() 
	{
		
		
	}

	public void deleteEmp()
	{
		
		
	}

	
	
	
}
