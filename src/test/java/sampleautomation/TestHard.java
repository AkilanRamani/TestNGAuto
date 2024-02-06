package sampleautomation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestHard {
  
	
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void testCasetwo456() {
	
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed - testCasetwo");
		/*System.out.println("Soft assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed - testCasetwo");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed - testCasetwo");
		System.out.println("*** test case two executed successfully ***");
		softAssert.assertAll(); */
	}
	@Test
	public void testCasetwo190() {
		
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed - testCasetwo");

}
	@Test
	public void testCasetwo3289() {
		
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed - testCasetwo");
	}
}

	

	


