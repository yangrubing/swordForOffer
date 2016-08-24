package problem40;

import junit.framework.Assert;
import org.junit.Test;

import static java.util.Calendar.getInstance;

/**
 * Created by bjyangrubing on 2016/8/24.
 */
public class NumbersAppearOnceTest
{

	@Test
	public void test()
	{
		getInstance();
		NumbersAppearOnce n = new NumbersAppearOnce();
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		n.FindNumsAppearOnce(new int[]
		{ 1, 2, 3, 3, 4, 4, 5, 5, 6, 6 }, num1, num2);
		Assert.assertTrue(num1[0] == 1 || num2[0] == 1);

	}
}
