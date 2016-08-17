package problem22;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/17.
 */
public class StackPushPopOrderTest
{
	@Test
	public void test()
	{
		StackPushPopOrder stack = new StackPushPopOrder();

		Assert.assertEquals(true, stack.IsPopOrder(new int[]
		{ 1, 2, 3, 4, 5 }, new int[]
		{ 4, 5, 3, 2, 1 }));

		Assert.assertEquals(false, stack.IsPopOrder(new int[]
		{ 1, 2, 3, 4, 5 }, new int[]
		{ 4, 5, 3, 1, 2 }));
	}

}
