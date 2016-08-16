package problem08;

import org.junit.Test;

import junit.framework.Assert;

public class MinNumberInRotatedArrayTest
{
	@Test
	public void test() throws Exception
	{
		MinNumberInRotatedArray min = new MinNumberInRotatedArray();
		Assert.assertEquals(0, min.min(new int[]
		{ 1, 1, 1, 0, 1 }, 5));
		Assert.assertEquals(0, min.min(new int[]
		{ 1, 0, 1, 1, 1 }, 5));
		Assert.assertEquals(1, min.min(new int[]
		{ 1, 2, 3, 4, 5 }, 5));
		Assert.assertEquals(1, min.min(new int[]
		{ 4, 5, 6, 1, 2, 3 }, 6));
	}
}
