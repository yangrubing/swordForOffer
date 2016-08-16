package problem09;

/**斐波那契数列
 * Created by bjyangrubing on 2016/8/16.
 */
public class Fibonacci
{
	/**
	 * 递归的方式
	 */
	public int fib(int n)
	{
		if (n <= 0)
		{
			return 0;
		}
		if (n == 1)
		{
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

	/**
	 * 非递归，递推的方式
	 */
	public int fib2(int n)
	{
		int[] result =
		{ 0, 1 };
		if (n < 2)
			return result[n];
		int fibNMinusOne = 1;
		int fibNMinusTwo = 0;
		int fibN = 0;
		for (int i = 2; i <= n; i++)
		{
			fibN = fibNMinusOne + fibNMinusTwo;
			fibNMinusTwo = fibNMinusOne;
			fibNMinusOne = fibN;
		}

		return fibN;

	}

	public static void main(String args[])
	{
		System.out.println(new Fibonacci().fib2(5));
	}
}
