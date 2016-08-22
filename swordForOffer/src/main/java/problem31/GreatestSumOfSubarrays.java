package problem31;

import java.util.Arrays;

/**最长子序列
 * Created by bjyangrubing on 2016/8/22.
 */
public class GreatestSumOfSubarrays
{

	/**
	 * 分治的方法
	 * @param array
	 * @return
	 */
	public int FindGreatestSumOfSubArray(int[] array)
	{
		if (array == null || array.length <= 0)
		{
			return 0;
		}
		if (array.length == 1)
			return array[0];

		int mid = (array.length >> 2);

		//找出左边序列的最大值lmax
		int lmax = array[mid], lsum = 0;
		for (int i = mid; i >= 0; i--)
		{
			lsum += array[i];
			if (lsum > lmax)
				lmax = lsum;
		}

		//找出右边序列的最大值为rmax
		int rmax = array[mid + 1], rsum = 0;
		for (int i = mid + 1; i < array.length; i++)
		{
			rsum += array[i];
			if (rsum > rmax)
				rmax = rsum;
		}

		//返回的为左边序列的最长，右边最长以及横跨中间的 三者最大值
		return max3(rmax + lmax, FindGreatestSumOfSubArray(Arrays.copyOfRange(array, 0, mid + 1)),
				FindGreatestSumOfSubArray(Arrays.copyOfRange(array, mid + 1, array.length)));
	}

	public int max3(int a, int b, int c)
	{
		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		return max;
	}

	/**
	 * O（n^2)的方法
	 * @param array
	 * @return
	 */
	public int FindGreatestSumOfSubArray_1(int[] array)
	{
		if (array == null || array.length <= 0)
		{
			return 0;
		}

		int result = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++)
		{
			int thisSum = 0;
			for (int j = i; j < array.length; j++)
			{
				thisSum += array[j];
				if (thisSum > result)
					result = thisSum;
			}
		}

		return result;
	}

}
