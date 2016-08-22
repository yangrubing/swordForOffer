package problem31;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/22.
 */
public class GreatestSumOfSubarraysTest
{
	@Test
	public void test()
	{
		int[] arr =
		{ 1, -2, 3, 10, -4, 7, 2, -5 };

		int result = new GreatestSumOfSubarrays().FindGreatestSumOfSubArray(arr);
		Assert.assertEquals(18, result);
	}

}
