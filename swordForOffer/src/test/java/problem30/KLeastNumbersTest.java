package problem30;

import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/22.
 */
public class KLeastNumbersTest
{

	@Test
	public void test()
	{
		KLeastNumbers k = new KLeastNumbers();
		System.out.println(k.GetLeastNumbers_Solution(new int[]
		{ 4, 5, 1, 6, 2, 7, 3, 8 }, 4));

	}
}
