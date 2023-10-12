package TestNG_parallel;

import org.testng.annotations.Test;

public class sample2 {
	@Test
	public void demo3()
	{
		System.out.println("hi demo3");
	}
	
	@Test(groups="smoke")
	public void demo4()
	{
		System.out.println("hi demo4");
	}

}
