package problem38;

/**统计一个数字在排序数组中出现的次数。
 * Created by bjyangrubing on 2016/8/23.
 */
public class NumberOfK
{
	/**思路：先找到第一个k和最后一个k的位置，然后再计算*/
	public int GetNumberOfK(int[] array, int k)
	{
		if (array == null || array.length <= 0)
		{
			return 0;
		}

		int firstIndex = firstKIndex(array, k, 0, array.length - 1);
		int lastIndex = lastKIndex(array, k, 0, array.length - 1);

		if (firstIndex > -1 && lastIndex > -1)
		{
			return lastIndex - firstIndex + 1;
		}
		return 0;
	}

	/**
	 * 获得第一个k的坐标
	 * @param array
	 * @param k
	 * @param start
	 * @param end
	 * @return
	 */
	public int firstKIndex(int[] array, int k, int start, int end)
	{
		if (start > end)
			return -1;
		int middleIndex = (start + end) / 2;
		int middleValue = array[middleIndex];

		if (middleValue == k)
		{
			if ((middleIndex > 0 && array[middleIndex - 1] != k) || middleIndex == 0)
				return middleIndex;
			else
				end = middleIndex - 1;
		}
		else if (middleValue < k)
		{
			start = middleIndex + 1;
		}
		else
		{
			end = middleIndex - 1;
		}

		return firstKIndex(array, k, start, end);
	}

	/**
	 * 最后一个k的坐标
	 * @param array
	 * @param k
	 * @param start
	 * @param end
	 * @return
	 */
	public int lastKIndex(int[] array, int k, int start, int end)
	{
		if (start > end)
			return -1;

		while (start <= end)
		{
			int middleIndex = (start + end) / 2;
			int middleValue = array[middleIndex];
			if (middleValue == k)
			{
				if ((middleIndex < array.length - 1 && array[middleIndex + 1] != k) || middleIndex == array.length - 1)
					return middleIndex;
				else
					start = middleIndex + 1;
			}
			else if (middleValue < k)
			{
				start = middleIndex + 1;
			}
			else
			{
				end = middleIndex - 1;
			}
		}

		return -1;
	}

}
