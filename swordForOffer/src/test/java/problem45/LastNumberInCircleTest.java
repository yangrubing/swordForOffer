package problem45;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/26.
 */
public class LastNumberInCircleTest
{

	@Test
	public void test()
	{
		LastNumberInCircle l = new LastNumberInCircle();

		Assert.assertEquals(3, l.LastRemaining_Solution(5, 3));

	}
}
