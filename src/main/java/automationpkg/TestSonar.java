package automationpkg;

public class TestSonar 
{
	public int sum(int a, int b)
	{
		int c = a + b;
		int d; //for codesmells
		int e; //for codesmells
		int f; // for codesmells
		return c;
	}
	

	public static void main(String[] args) 
	{
		TestSonar obj = new TestSonar();
		System.out.println("sum is :" +obj.sum(10, 5));	
	}

}
