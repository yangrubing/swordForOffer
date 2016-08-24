package problem35;

import java.util.LinkedHashMap;

/**找出字符串中第一个只出现一次的字符
 * Created by bjyangrubing on 2016/8/23.
 */
public class FindNotRepeatingChar
{

	public int FirstNotRepeatingChar(String str)
	{
		int result = -1;
		if (str == null || str.length() <= 0)
			return result;
		char[] arr = str.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++)
		{

			if (!map.containsKey(arr[i]))
			{
				map.put(arr[i], 1);
			}
			else
			{
				Integer count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			}
		}

		for (int i = 0; i < arr.length; i++)
		{
			if (map.get(arr[i]) == 1)
				return i;
		}
		return result;
	}

}
