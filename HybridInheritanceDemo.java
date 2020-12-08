class A
{
	public String name="Amal";
	public int age=19;
	public void display()
	{
		System.out.println("Hello!");
	}
}
interface B
{
	
	void display();
	
}
interface C
{
	void display();
	
}
class D extends A implements B,C
{
	public void display1()
	{
		System.out.println("Wassup!");
		
	}
	
}




class HybridInheritanceDemo
{
	public static void main(String[] args)
	{
		//D ob=new D();
		D ob=new D();
		
		System.out.println(ob.name);
	}
}