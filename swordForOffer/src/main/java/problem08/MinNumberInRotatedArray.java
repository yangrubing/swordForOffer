package problem08;

/**
 * 旋转数组嘴小的数字，如{3，4，5，1，2}为{1，2，3，4，5}的一个旋转
 *
 * @author bjyangrubing
 *
 */
public class MinNumberInRotatedArray
{
	public int min(int[] numbers, int length) throws Exception
	{
		if (numbers == null || length <= 0)//边界条件判断
			throw new Exception("Invalid parameters.");
		int index1 = 0;
		int index2 = length - 1;
		int indexMid = index1;//特殊情况处理，如果数组为{1，2，3，4，5},则直接返回1
		while (numbers[index1] >= numbers[index2])//这一句的目的也是为了上面特殊情况，如果为上述数组，则可直接返回numbers[index1]
		{
			if (index2 - index1 == 1)
			{
				indexMid = index2;//循环终止条件是index2-index1 = 1
				break;
			}

			indexMid = (index1 + index2) / 2;
			//中间的元素，要不位于前面的递增序列(大于numbers[index1])
			//要不位于后面的递增序列(小于numbers[index2])。
			//注意特殊情况，如果numbers[index2] = numbers[index1] = numbers[indexMid]
			//如{1，0，1，1，1}和{1，1，1，0，1}这种情况时无法判断最小值是在前面的递增子序列，还是后面的递增子序列
			//此时可以采用顺序查找

			if (numbers[index1] == numbers[index2] && numbers[index1] == numbers[indexMid])
			{
				return minInOrder(numbers, index1, index2);
			}

			if (numbers[indexMid] >= numbers[index1])
			{
				index1 = indexMid;
			}
			else if (numbers[indexMid] <= numbers[index2])
			{
				index2 = indexMid;
			}
		}

		return numbers[indexMid];
	}

	int minInOrder(int[] numbers, int index1, int index2)
	{
		int result = numbers[index1];
		for (int i = index1 + 1; i <= index2; ++i)
		{
			if (result > numbers[i])
			{
				result = numbers[i];
			}
		}
		return result;
	}
}
