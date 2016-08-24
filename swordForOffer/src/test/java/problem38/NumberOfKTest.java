package problem38;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/23.
 */
public class NumberOfKTest
{
	@Test
	public void test()
	{
		NumberOfK n = new NumberOfK();
		Assert.assertEquals(6, n.GetNumberOfK(new int[]
		{ 1, 2, 3, 3, 3, 3, 3, 3, 5 }, 3));
	}

}
