package automationpkg;

public class Calculator 
{
	
	public int sum(int a, int b)
	{
		return (a + b);
	}
	public int diff(int a, int b)
	{
		return (a - b);
	}
	public int mul(int a, int b)
	{
		return (a * b);
	}
	public int div(int a, int b)
	{
		return (a / b);
	}
	public void display()
	{
		System.out.println("GFG");
	}
	
	public void display2()
	{
		System.out.println("MUZAFFARPUR");
	}
	public void display3()
	{
		System.out.println("BIHAR");
	}
	
	
	public static void main(String[] args) 
	{
		Calculator obj = new Calculator();
		System.out.println("SUM = " +obj.sum(10, 2));
		System.out.println("DIFF = " +obj.diff(10, 2));
		System.out.println("MUL = " +obj.mul(10, 2));
		System.out.println("DIV = " +obj.div(10, 2));
		obj.display();
	}
}
