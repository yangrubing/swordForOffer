package problem43;

/**把n个骰子仍在地上，所有骰子朝上一面的点数之和为s,输入n,打印出s的所有可能出现的概率
 * Created by bjyangrubing on 2016/8/25.
 */
public class DicesProbability
{
	private static final int G_MAXVALUE = 6;

	public void printProbability(int number)
	{
		if (number < 1)
			return;

		int[][] probabilities = new int[2][];
		probabilities[0] = new int[G_MAXVALUE * number + 1];
		probabilities[1] = new int[G_MAXVALUE * number + 1];
		int flag = 0;
		for (int i = 1; i <= G_MAXVALUE; i++)
			probabilities[0][i] = 1;
		for (int k = 2; k <= number; ++k)
		{
			for (int i = 0; i < k; ++i)
				probabilities[1 - flag][i] = 0;
			for (int i = k; i <= G_MAXVALUE * k; ++i)
			{
				probabilities[1 - flag][i] = 0;
				for (int j = 1; j <= i && j <= G_MAXVALUE; ++j)
					probabilities[1 - flag][i] += probabilities[flag][i - j];
			}
			flag = 1 - flag;
		}
		double total = Math.pow(G_MAXVALUE, number);
		for (int i = number; i <= G_MAXVALUE * number; i++)
		{
			double ratio = (double) probabilities[flag][i] / total;
			System.out.println(i);
			System.out.println(ratio);
		}
	}
}
