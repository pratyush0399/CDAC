
public class EmployeeMain
{

	public static void main(String[] args) 
	{
	
		EmployeeManagement em = new EmployeeManagement();
		
		
		Employee[] e =em.createEmp();
		em.dispEmp(e);
		//em.updateEmp();
		//em.deleteEmp();
		
		
	}
	
}
