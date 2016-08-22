package problem29;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/22.
 */
public class MoreThanHalfNumberTest
{

	@Test
	public void test()
	{
		MoreThanHalfNumber m = new MoreThanHalfNumber();

		Assert.assertEquals(0, m.MoreThanHalfNum_Solution(null));

		Assert.assertEquals(2, m.MoreThanHalfNum_Solution(new int[]
		{ 1, 2, 3, 3, 4, 2, 2, 2, 2, 2, 2 }));

	}

}
