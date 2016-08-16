package problem14;

/**调整数组顺序使奇数位于偶数之前。
 * Created by bjyangrubing on 2016/8/16.
 */
public class ReorderArray
{
	public void reorder(int[] array)
	{
		if (array == null || array.length <= 0)
			return;
		int left = 0, right = array.length - 1;
		while (left < right)
		{
			//从左向右找偶数
			while (left < right && array[left] % 2 != 0)
				left++;
			//从右向左找奇数
			while (left < right && array[right] % 2 == 0)
				right--;
			//找到后交换
			if (left < right)
			{
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
			}
		}
	}

}
