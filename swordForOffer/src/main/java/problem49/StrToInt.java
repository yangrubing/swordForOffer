package problem49;

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * Created by bjyangrubing on 2016/8/26.
 */
public class StrToInt
{

	public int strToInt(String str)
	{
		if (str == null || str.length() <= 0)
			return 0;
		char[] array = str.toCharArray();
		boolean positive = true;
		int beginIndex = 0;
		if (array[0] == '-')
		{
			positive = false;
			beginIndex += 1;
		}
		else if (array[0] == '+')
		{
			beginIndex += 1;
		}
		else if (!Character.isDigit(array[0]))
		{
			return 0;
		}
		int result = 0;
		for (int i = beginIndex; i < array.length; i++)
		{
			if (!Character.isDigit(array[i]))
			{
				return 0;
			}
			result *= 10;
			result -= (array[i] - '0');
		}

		return positive ? -result : result;

	}

}
