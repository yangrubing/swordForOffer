package problem30;

import java.util.ArrayList;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4
 * Created by bjyangrubing on 2016/8/22.
 */
public class KLeastNumbers
{
	private ArrayList<Integer> rtList = new ArrayList<Integer>();

	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k)
	{
		if (input == null || input.length <= 0 || k <= 0 || input.length < k)
			return new ArrayList<Integer>();

		int start = 0;
		int end = input.length - 1;
		int index = partition(input, start, end);
		while (index != k - 1)//这里是k-1 如果是k的话会下标越界
		{
			if (index > k - 1)
			{
				end = index - 1;
				index = partition(input, start, end);
			}
			else
			{
				start = index + 1;
				index = partition(input, start, end);
			}
		}
		for (int i = 0; i < k; i++)
		{
			rtList.add(input[i]);
		}

		return rtList;
	}

	/**
	 * 比第一个元素小的都在左边， 比第一个元素大的都在右边
	 * @param input
	 * @param start
	 * @param end 
	 * @return 返回的是划分后的第一个元素的坐标
	 */

	private int partition(int[] input, int start, int end)
	{
		int pivot = input[start];
		while (start < end)
		{
			while (start < end && input[end] >= pivot)
				end--;
			if (start < end)
			{
				swap(input, start, end);
			}
			while (start < end && input[start] <= pivot)
				start++;
			if (start < end)
			{
				swap(input, start, end);
			}
		}

		return start;
	}

	private void swap(int[] input, int start, int end)
	{
		int temp = input[start];
		input[start] = input[end];
		input[end] = temp;

	}
}
