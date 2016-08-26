package problem49;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/26.
 */
public class StrToIntTest
{
	@Test
	public void test()
	{
		StrToInt s = new StrToInt();
		Assert.assertEquals(123, s.strToInt("123"));
		Assert.assertEquals(-123, s.strToInt("-123"));
		Assert.assertEquals(123, s.strToInt("+123"));
	}
}
