package testNgXML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failed {
	@Test
	public void A()
	{
		Assert.fail();
	Reporter.log("A method is running", true);
	}
	@Test
	public void B()
	{
	Reporter.log("B method is running", true);
	}
	@Test
	public void C()
	{
	Reporter.log("C method is running", true);
	}
	@Test
	public void D()
	{
	Reporter.log("D method is running", true);
	}
}
