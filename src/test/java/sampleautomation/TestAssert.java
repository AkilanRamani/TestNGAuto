package sampleautomation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssert {
	
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void testCasetwo() {
	
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed - testCasetwo");
		/*System.out.println("Soft assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed - testCasetwo");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed - testCasetwo");
		System.out.println("*** test case two executed successfully ***");
		softAssert.assertAll(); */
	}
	@Test
	public void testCasetwo1() {
		
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed - testCasetwo");

}
	@Test
	public void testCasetwo32() {
		
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed - testCasetwo");
	}
}
