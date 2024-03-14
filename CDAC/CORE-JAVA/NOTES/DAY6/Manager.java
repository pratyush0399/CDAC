
public class Manager extends Person
{
      String desig;
      
	public Manager(int id, String name, String add,String desig)
	{
		super(id, name, add);
		this.desig = desig;
	}
	
	void dispmanager()
	{    super.dispPerson();
		System.out.println(desig);
	}

	
}
