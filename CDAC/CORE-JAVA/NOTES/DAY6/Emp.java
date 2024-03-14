
public class Emp extends Person
{
    float sal;
    
    Emp(int id,String name,String add,float sal)
    {
    	 super(id,name,add);
    	this.sal = sal;
    }
	
    void dispEmp()
    {
    	super.dispPerson();
    	System.out.print(sal);
    	System.out.println();
    }
    

}
