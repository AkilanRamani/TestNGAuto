package sampleautomation;

import org.testng.annotations.Test;

public class TheadInvocation {
	@Test(invocationCount = 10, threadPoolSize = 6)
	  public void testThreadPools() {


	  System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
	   
	  }
	
}
