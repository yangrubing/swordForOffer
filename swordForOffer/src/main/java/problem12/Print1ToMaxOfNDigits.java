package problem12;

/**
 * 打印1到最大的n位数，如输入3，则打印1，2，3，。。。。，999
 * 思路：大数，如果面试题是关于n位的整数并且没有限定n的取值范围，或者输入任意大小的整数，则要考虑用
 * 字符串来模拟大数问题
 * Created by bjyangrubing on 2016/8/16.
 */
public class Print1ToMaxOfNDigits
{
	public void print1ToMaxOfNDigits(int n)
	{
		if (n <= 0)
			return;
		char[] numbers = new char[n];
		//初始化numbers为0
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = '0';
		}
		while (!increment(numbers))//如果没有overFlow
		{
			printNumbers(numbers);
		}

	}

	/**
	 * 打印的函数
	 * @param numbers
	 */
	private void printNumbers(char[] numbers)
	{
		boolean isBeginning0 = true;
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] != '0')
				isBeginning0 = false;
			if (!isBeginning0)
			{
				System.out.print(numbers[i]);
			}
		}

		System.out.println();
	}

	private boolean increment(char[] numbers)
	{
		boolean isOverFlow = false;
		int nTakeOver = 0;//第n位的进位，有则为0
		int nLength = numbers.length;
		for (int i = nLength - 1; i >= 0; i--)
		{
			int nSum = numbers[i] - '0' + nTakeOver;//第n位的和
			if (i == nLength - 1)//如果是个位，则+1
				nSum += 1;
			if (nSum >= 10)//加完以后大于10
			{//如果末位的数值大于10
				if (i == 0)
				{//如果是最高位
					isOverFlow = true;
				}
				else
				{//否则设置为有进位，并且把值设置为'0'
					nSum -= 10;
					nTakeOver = 1;
					numbers[i] = (char) ('0' + nSum);
				}
			}
			else
			{//否则，直接赋值并且break
				numbers[i] = (char) (nSum + '0');
				break;
			}
		}
		return isOverFlow;
	}

	public static void main(String[] args)
	{
		Print1ToMaxOfNDigits p = new Print1ToMaxOfNDigits();
		p.print1ToMaxOfNDigits(3);
	}

}
