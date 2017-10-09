
public class ChildClass extends BaseClass
{
	
	@Override
	public void sayHello()
	{
		System.out.println("Hello from child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass cc=new ChildClass();
		
		cc.sayHello();

	}

}
