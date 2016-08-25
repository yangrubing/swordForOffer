package problem44;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/25.
 */
public class ContinousCardTest
{
	@Test
	public void test()
	{
		ContinousCard c = new ContinousCard();

		Assert.assertEquals(true, c.isContinuous(new int[]
		{ 3, 2, 4, 5, 0 }));

	}

}
