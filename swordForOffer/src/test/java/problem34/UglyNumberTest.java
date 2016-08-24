package problem34;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/23.
 */
public class UglyNumberTest
{
	@Test
	public void test()
	{
		UglyNumber u = new UglyNumber();

		Assert.assertEquals(1, u.GetUglyNumber_Solution(1));
	}

}
