package TestNG_parallel;

import org.testng.annotations.Test;

public class sample1 {
	@Test
	public void demo1()
	{
		System.out.println("hi demo1");
	}
	
	@Test(groups="smoke")
	public void demo2()
	{
		System.out.println("hi demo2");
	}

}
