package problem46;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/26.
 */
public class AccumulateTest
{

	@Test
	public void test()
	{
		Accumulate a = new Accumulate();

		int sum = a.Sum_Solution(4);
		Assert.assertEquals(10, sum);
	}
}
