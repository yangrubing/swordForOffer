package problem47;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/26.
 */
public class AddTwoNumberTest
{
	@Test
	public void test()
	{
		AddTwoNumber a = new AddTwoNumber();

		Assert.assertEquals(2, a.Add(1, 1));
	}

}
