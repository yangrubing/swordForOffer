package problem10;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/16.
 */
public class NumberOf1InBinaryTest
{
	@Test
	public void test()
	{
		NumberOf1InBinary numberOf1InBinary = new NumberOf1InBinary();
		Assert.assertEquals(4, numberOf1InBinary.numberOf1(15));
	}
}
