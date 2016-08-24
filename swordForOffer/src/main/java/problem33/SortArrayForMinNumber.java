package problem33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * Created by bjyangrubing on 2016/8/22.
 */
public class SortArrayForMinNumber
{

	List<String> l = new ArrayList<String>();

	public String PrintMinNumber(int[] numbers)
	{
		String result = "";
		if (numbers == null || numbers.length <= 0)
			return result;
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < numbers.length; i++)
		{
			list.add(numbers[i]);
		}

		//对数组进行全排列，得到所有可能的结果，然后进行遍历
		permation("", list);
		result = l.get(0);
		for (int i = 1; i < l.size(); i++)
		{
			if (l.get(i).compareTo(result) < 0)
				result = l.get(i);
		}
		return result;
	}

	void permation(String prefix, List<Integer> list)
	{
		if (list.size() == 0)
		{
			l.add(prefix);
		}
		else
		{
			for (int i = 0; i < list.size(); i++)
			{
				List<Integer> temp = new LinkedList<Integer>(list.subList(0, i));
				temp.addAll(list.subList(i + 1, list.size()));
				permation(prefix + list.get(i), temp);
			}
		}
	}

	public static void main(String[] args)
	{

		System.out.println(new SortArrayForMinNumber().PrintMinNumber(new int[]
		{ 3, 32, 321 }));
	}
}
