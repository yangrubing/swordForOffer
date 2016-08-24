package problem36;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/23.
 */
public class InversePairsTest
{

	@Test
	public void test()
	{

		InversePairs i = new InversePairs();

		Assert.assertEquals(5, i.InversePairs(new int[]
		{ 7, 5, 6, 4 }));
	}
}
