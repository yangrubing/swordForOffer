package problem04;

import java.util.Arrays;

/**
 * 将数组中的空格替换为"%20"
 * @author bjyangrubing
 *
 */
public class ReplaceBlank
{
	public static String replaceBlank(String str)
	{
		return str.replace(" ", "%20");
	}

	public static String replaceBlank1(String str)
	{

		if (str == null)
			return null;
		char[] charArr = str.toCharArray();
		//遍历统计出有多少个空格
		int count = 0;
		for (int i = 0; i < charArr.length; i++)
		{
			if (charArr[i] == ' ')
				count++;
		}
		//定义两个指针，p1指向原来数组的末尾，p2另外一个指向新的数组的末尾
		//然后两个指针一起往前走，如果arr[p1] == ' '，则将arr[p2]替换为“%20”
		int p1 = charArr.length - 1, p2 = p1 + count * 2;
		//对数组进行扩容
		charArr = Arrays.copyOf(charArr, charArr.length + count * 2);
		while (p1 != p2 && p1 >= 0)//p1和p2最后会相遇
		{
			if (charArr[p1] == ' ')
			{
				charArr[p2--] = '0';
				charArr[p2--] = '2';
				charArr[p2--] = '%';
			}
			else
			{
				charArr[p2--] = charArr[p1];
			}
			p1--;//无论如何p1都要往前走一格
		}
		return String.valueOf(charArr);
	}

}
