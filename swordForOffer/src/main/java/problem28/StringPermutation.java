package problem28;

import java.util.ArrayList;

/**
 * Created by bjyangrubing on 2016/8/19.
 */
public class StringPermutation
{

	ArrayList<String> rtList = new ArrayList<String>();

	public ArrayList<String> Permutation(String str)
	{

		if (str == null)
			return rtList;
		Permutation(str.toCharArray(), 0, str.length() - 1);
		return rtList;
	}

	/**
	 * 采用交换的思想，如果两个字符相同则不交换
	 * @param str 字符串
	 * @param i 字符串的开始index
	 * @param n 字符串的终止index
	 */
	public void Permutation(char[] str, int i, int n)
	{
		int j;
		if (i == n)
		{
			rtList.add(new String(str));
		}
		else
		{
			for (j = i; j <= n; j++)
			{
				//如果相同则不交换
				if (str[i] == str[j] && j != i)
					continue;
				swap(str, i, j);
				Permutation(str, i + 1, n);//将起始位置+1
				swap(str, i, j);//trace back
			}
		}
	}

	/**
	 * 会有重复的，可以采用set来去重
	 * @param prefix 前缀
	 * @param str 字符串
	 */

	public void permutation(String prefix, String str)
	{
		if (str.length() == 0)
		{
			System.out.println(prefix);
			//rtList.add(prefix);
		}
		else
		{
			for (int i = 0; i < str.length(); i++)
			{
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
			}
		}
	}

	private void swap(char[] arr, int i, int j)
	{
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
