package problem21;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/17.
 */
public class MinInStackTest
{
	@Test
	public void test()
	{
		MinInStack min = new MinInStack();

		min.push(1);
		min.push(2);
		min.push(3);

		Assert.assertEquals(1, min.min());
		Assert.assertEquals(3, min.top());

		min.pop();

		Assert.assertEquals(1, min.min());
		Assert.assertEquals(2, min.top());

	}
}
