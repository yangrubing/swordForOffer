package problem14;

import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/16.
 */
public class ReorderArrayTest
{
	@Test
	public void test()
	{
		ReorderArray reorderArray = new ReorderArray();
		int[] arr =
		{ 1, 2, 3, 4, 5 };
		reorderArray.reorder(arr);
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
