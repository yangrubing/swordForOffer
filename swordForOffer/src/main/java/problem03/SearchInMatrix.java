package problem03;

import java.util.Arrays;

/**
 * 一个二维数组，每一行从左到右递增，每一列从上到下递增．
 * 输入一个二维数组和一个整数，判断数组中是否含有整数
 *@author bjyangrubing
 */
public class SearchInMatrix
{
	public static boolean find(int[][] array, int target)
	{
		if (array == null)
			return false;
		//从左下角或者右上角开始查找
		int rows = array.length - 1, columns = 0;
		while (rows >= 0 && columns < array.length - 1)//必须同时满足，如果用两层for循环则出现死循环
		{
			if (array[rows][columns] == target)
			{
				return true;
			}
			else if (array[rows][columns] > target)//如果比目标大，则往上走
			{
				rows--;
			}
			else//否则向右走
			{
				columns++;
			}
		}
		return false;
	}

	/**
	 * 采用二分查找的方法，复杂度为O(nlgn)
	 * @param array
	 * @param target
	 * @return
	 */
	public static boolean find1(int[][] array, int target)
	{
		if (array == null)
			return false;

		for (int i = 0; i < array.length; i++)
		{
			int res = Arrays.binarySearch(array[i], target);
			if (res > 0)
				return true;
		}

		return false;
	}
}
