package problem24;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/18.
 */
public class SequeneBSTTest
{

	@Test
	public void test()
	{
		SequeneBST s = new SequeneBST();

		Assert.assertEquals(true, s.verifySquenceOfBST(new int[]
		{ 5, 7, 6, 9, 11, 10, 8 }));

		Assert.assertEquals(false, s.verifySquenceOfBST(new int[]
		{ 7, 4, 6, 5 }));
	}
}
