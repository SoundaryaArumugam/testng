package learningTestng;


import org.testng.annotations.Test;
public class testng {
	
	@Test(priority=1, enabled=true)
	public void method1()
	{
		System.out.println("Hello World");
	}
	@Test(priority=0)
	public void anbu()
	{
		System.out.println("I love India");
	}
	
}
