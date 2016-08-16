package problem11;

/**
 * 求数值的整数次方
 * 需要考虑的边界条件：
 * 1. 0的0次方
 * 2. exponent为负数
 * 3. double的精度问题
 * Created by bjyangrubing on 2016/8/16.
 */
public class Power
{
	public double power(double base, int exponent) throws Exception
	{
		double result = 0.0;
		if (equal(base, 0.0) && exponent < 0)
			throw new Exception("0的负数次幂无意义");
		if (equal(exponent, 0))
			return 1.0;
		if (exponent < 0)
		{
			result = powerWithExponent(1.0 / base, -exponent);
		}
		else
		{
			result = powerWithExponent(base, exponent);
		}
		return result;
	}

	private double powerWithExponent(double base, int exponent)
	{
		double result = 1.0;
		for (int i = 0; i < exponent; i++)
		{
			result *= base;
		}
		return result;
	}

	public boolean equal(double base, double v)
	{
		if ((base - v > -0.0000001) && (base - v < 0.0000001))
			return true;
		return false;
	}

}
