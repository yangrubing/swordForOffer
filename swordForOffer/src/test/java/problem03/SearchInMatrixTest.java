package problem03;

import org.junit.Test;

import junit.framework.Assert;

public class SearchInMatrixTest
{

	private static int[][] array =
	{
			{ 1, 2, 8, 9 },
			{ 2, 4, 9, 12 },
			{ 4, 7, 10, 13 },
			{ 6, 8, 11, 15 } };

	@Test
	public void testFind()
	{
		Assert.assertEquals(false, SearchInMatrix.find(null, 17));

		Assert.assertEquals(true, SearchInMatrix.find(array, 7));

		Assert.assertEquals(false, SearchInMatrix.find(array, 18));
	}

}
