package problem10;

/**
 * 输入一个整数，输出该数的二进制表示中1的个数。
 * 思路：移位
 * Created by bjyangrubing on 2016/8/16.
 */
public class NumberOf1InBinary
{

	public int numberOf1(int n)
	{
		int count = 0;
		while (n != 0)
		{
			//每次&都能使一个1变成0
			//如1111&1110=1110
			//1110&1101=1100
			n = (n & n - 1);
			count++;
		}
		return count;
	}

	public static void main(String[] args)
	{
		System.out.println(new NumberOf1InBinary().numberOf1(-1));
	}
}
