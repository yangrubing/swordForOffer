package problem32;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/22.
 */
public class NumberOf1Test
{

	@Test
	public void test()
	{
		NumberOf1 n = new NumberOf1();
		int count = n.NumberOf1Between1AndN_Solution(5);
		Assert.assertEquals(1, count);
	}
}
