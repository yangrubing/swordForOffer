package problem33;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/23.
 */
public class SortArrayForMinNumberTest
{

	@Test
	public void test()
	{
		SortArrayForMinNumber s = new SortArrayForMinNumber();
		Assert.assertEquals("123", s.PrintMinNumber(new int[]
		{ 1, 2, 3 }));
	}
}
