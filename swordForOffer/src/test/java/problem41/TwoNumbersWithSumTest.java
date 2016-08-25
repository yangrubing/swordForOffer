package problem41;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by bjyangrubing on 2016/8/25.
 */
public class TwoNumbersWithSumTest
{
	@Test
	public void test()
	{
		TwoNumbersWithSum t = new TwoNumbersWithSum();

		ArrayList<ArrayList<Integer>> list = t.FindContinuousSequence(9);

		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}

		ArrayList<Integer> list1 = t.FindNumbersWithSum(new int[]
		{ 1, 2, 3, 4, 5, 6, 7 }, 8);

		for (int i = 0; i < list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}

	}

}
