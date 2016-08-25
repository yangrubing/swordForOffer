package problem42;

/**
 * Created by bjyangrubing on 2016/8/25.
 */
public class StringReverse
{

	/**输入一个字符串，翻转句子中单词的顺序，但单词内的字符的顺序不变。
	 * 如"I am a student."变为"student. a am I"
	 * 思路：先翻转整个字符串，然后在翻转每个单词
	 * */
	public String ReverseSentence(String str)
	{
		if (str == null || str.length() < 0)
			return str;
		char[] arr = str.toCharArray();
		//先翻转字符串
		reverseCharArray(arr, 0, arr.length - 1);
		int begin = 0, end = 0;
		while (begin < arr.length)
		{
			if (arr[begin] == ' ')
			{
				begin++;
				end++;
			}
			else if (arr[end] == ' ')
			{
				reverseCharArray(arr, begin, end - 1);
				end++;
				begin = end;
			}
			else if (end == arr.length - 1)
			{
				reverseCharArray(arr, begin, end);
				end++;
				begin = end;
			}
			else
			{
				end++;
			}
		}

		return String.valueOf(arr);
	}

	private void reverseCharArray(char[] array, int begin, int end)
	{
		while (begin < end)
		{
			char temp = array[begin];
			array[begin] = array[end];
			array[end] = temp;
			begin++;
			end--;
		}
	}

	/**左旋字符串*/
	public String LeftRotateString(String str, int n)
	{
		if (str == null || str.length() <= 0)
			return "";
		char[] arr = str.toCharArray();
		//三次翻转
		reverseCharArray(arr, 0, n - 1);
		reverseCharArray(arr, n, arr.length - 1);
		reverseCharArray(arr, 0, arr.length - 1);
		return String.valueOf(arr);
	}

}
