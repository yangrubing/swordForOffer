package problem34;

import java.util.ArrayList;
import java.util.List;

/**把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * Created by bjyangrubing on 2016/8/23.
 */
public class UglyNumber
{
	public int GetUglyNumber_Solution(int index)
	{
		if (index <= 0)
			return 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);

		//分别表示这个乘以2后大于nowmax的最小值
		int m2 = 0, m3 = 0, m5 = 0;
		while (list.size() < index)
		{
			int nowMax = list.get(list.size() - 1);//由于是有序数组，当前的最大值nowMax为最后一个
			for (int i = 0; i < list.size(); i++)
			{
				if (list.get(i) * 2 > nowMax)
				{
					m2 = list.get(i) * 2;
					break;
				}

			}
			for (int i = 0; i < list.size(); i++)
			{
				if (list.get(i) * 3 > nowMax)
				{
					m3 = list.get(i) * 3;
					break;
				}
			}
			for (int i = 0; i < list.size(); i++)
			{
				if (list.get(i) * 5 > nowMax)
				{
					m5 = list.get(i) * 5;
					break;
				}
			}

			int min = Math.min(m2, Math.min(m3, m5));
			list.add(min);
		}

		return list.get(index - 1);
	}

	public boolean isUglyNumber(int number)
	{
		while (number % 2 == 0)
			number /= 2;
		while (number % 3 == 0)
			number /= 3;
		while (number % 5 == 0)
			number /= 5;
		return number == 1 ? true : false;
	}

	public static void main(String[] args)
	{
		System.out.println(new UglyNumber().GetUglyNumber_Solution(1500));
	}
}
