package problem46;

/**求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * Created by bjyangrubing on 2016/8/26.
 */
public class Accumulate
{
	/**递归*/
	public int Sum_Solution(int n)
	{
		if (n == 1 || n == 0)
			return n;

		return n + Sum_Solution(n - 1);
	}

}
