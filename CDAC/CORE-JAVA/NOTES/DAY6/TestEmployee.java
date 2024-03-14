import java.util.Scanner;

public class TestEmployee 
{

	public static void main(String[] args) 
	{		
	
		//int[] num = new int[4];
		//num[0] = 10
		//int a;
		
//		Employee e1 = new Employee(1001,"shan",3000);
//	
//		e1.dispEmpDetails();
//		
//		Employee e2 = new Employee(1002,"raj",4000);
//		
//		e2.dispEmpDetails();	
//       Employee e3 = new Employee(1003,"siju",5000);
//		
//		e3.dispEmpDetails();
//		
		
		
		Employee[] e = new Employee[2];
		// creation
		
		Scanner s = new Scanner(System.in);
		for(int i = 0;i<e.length;i++)
		{
			e[i]= new Employee(s.nextInt(),s.next(),s.nextFloat());
			
					
		}
		
		//display
		
		for(int i = 0;i<e.length;i++)
		{
			
					
			e[i].dispEmpDetails();	
		}
		
   
		//update
		

				
		
		//delete
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
