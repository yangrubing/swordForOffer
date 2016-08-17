package problem04;

import junit.framework.Assert;
import org.junit.Test;

public class ReplaceBlankTest
{
	@Test
	public void test()
	{
		Assert.assertEquals(ReplaceBlank.replaceBlank1("123  "), "123%20%20");

		Assert.assertEquals(ReplaceBlank.replaceBlank1("We are happy."), "We%20are%20happy.");

		Assert.assertEquals(ReplaceBlank.replaceBlank1(null), null);
	}

}
