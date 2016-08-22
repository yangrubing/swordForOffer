package problem29;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * Created by bjyangrubing on 2016/8/22.
 */
public class MoreThanHalfNumber
{
	public int MoreThanHalfNum_Solution(int[] array)
	{
		if (array == null || array.length <= 0)
			return 0;
		int start = 0;
		int end = array.length - 1;
		int mid = array.length >> 1;//n/2
		int index = partition(array, start, end);
		while (mid != index)
		{
			if (mid < index)
			{
				end = index - 1;
				index = partition(array, start, end);
			}
			else
			{
				start = index + 1;
				index = partition(array, start, end);
			}
		}

		int number = array[index];
		if (checkMoreThanHalf(array, number))
		{
			return number;
		}
		return 0;

	}

	/**
	 * 检查一个数字是否超过了数组的一半
	 *
	 * @param array  数组
	 * @param number 数字
	 * @return true or false
	 */
	private boolean checkMoreThanHalf(int[] array, int number)
	{
		int times = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (number == array[i])
				times++;
		}

		return times > (array.length / 2);
	}

	/**
	 * 快排的分割函数
	 *
	 * @return 分割后的index
	 */
	public int partition(int[] array, int start, int end)
	{

		int pivot = array[start];
		while (start < end)
		{
			while (start < end && array[end] >= pivot)
				end--;
			if (start < end)
			{
				swap(array, start, end);
			}
			while (start < end && array[start] <= pivot)
				start++;
			if (start < end)
			{
				swap(array, start, end);
			}
		}
		return start;
	}

	private void swap(int[] array, int start, int end)
	{
		int temp = array[start];
		array[start] = array[end];
		array[end] = temp;
	}

	public static void main(String[] args)
	{
		int[] arr =
		{ 1, 2, 3, 2, 4, 2, 5, 2, 3 };

		MoreThanHalfNumber m = new MoreThanHalfNumber();
		int number = m.MoreThanHalfNum_Solution(arr);
		System.out.println(number);
	}

}
