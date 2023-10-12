package TestNG;

import org.testng.annotations.Test;

public class priority_invocation_enabled {
	@Test(priority=-2,invocationCount=2,enabled=true)
	public void demo1()
	{
		System.out.println("silambarasi_1");
	}
	
	@Test
	public void demo2()
	{
		System.out.println("silambarasi_2");
	}
	
	@Test
	public void demo3()
	{
		System.out.println("silambarasi_3");
	}

}
