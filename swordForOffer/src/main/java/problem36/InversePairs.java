package problem36;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P
 * Created by bjyangrubing on 2016/8/23.
 */
public class InversePairs
{
	public int InversePairs(int[] array)
	{
		if (array == null || array.length <= 0)
			return 0;

		//构造一个辅助数组
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}

		int count = inverseParisCore(array, copy, 0, array.length - 1);

		return count;
	}

	private int inverseParisCore(int[] array, int[] copy, int start, int end)
	{
		//递归终止条件
		if (start == end)
		{
			copy[start] = array[start];
			return 0;
		}

		int middle = (start + end) / 2;
		int leftCount = inverseParisCore(copy, array, start, middle);
		int rightCount = inverseParisCore(copy, array, middle + 1, end);

		int i = middle;
		int j = end;
		int indexCopy = end;
		int count = 0;
		while (i >= start && j >= middle + 1)
		{
			if (array[i] > array[j])
			{
				copy[indexCopy--] = array[i--];
				count += j - middle;
			}
			else
			{
				copy[indexCopy--] = array[j--];
			}
		}

		for (; i >= start; --i)
			copy[indexCopy--] = array[i];

		for (; j >= middle + 1; --j)
			copy[indexCopy--] = array[j];

		return (leftCount + rightCount + count);
	}

}
