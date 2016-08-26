package problem47;

/**写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * Created by bjyangrubing on 2016/8/26.
 */
public class AddTwoNumber
{
	public int Add(int num1, int num2)
	{
		int sum, carry;

		do
		{
			//先做异或,相当于各位相加不进位
			sum = (num1 ^ num2);
			//相当于进位
			carry = (num1 & num2) << 1;

			num1 = sum;
			num2 = carry;
		}
		while (num2 != 0);

		return num1;
	}
}
