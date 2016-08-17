package problem20;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 * 则打印1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * Created by bjyangrubing on 2016/8/17.
 */
public class PrintMatrix
{

	public void printMatrix(int[][] numbers, int rows, int columns)
	{
		if (numbers == null || rows <= 0 || columns <= 0)
			return;
		int start = 0;//打印的圈数
		//循环终止条件为columns > start*2 && rows>start*2
		while (columns > start * 2 && rows > start * 2)
		{
			printMatrixCycle(numbers, rows, columns, start);
			++start;
		}

	}

	private void printMatrixCycle(int[][] numbers, int rows, int columns, int start)
	{
		int endY = columns - 1 - start;
		int endX = rows - 1 - start;

		//从左到右打印一行
		for (int i = start; i <= endY; i++)
		{
			int number = numbers[start][i];
			System.out.print(number + " ");
		}

		//从上到下打印一行
		if (start < endX)
		{
			for (int i = start + 1; i <= endX; i++)
			{
				int number = numbers[i][endY];
				System.out.print(number + " ");
			}
		}

		//从右到左打印一行
		if (start < endX && start < endY)
		{
			for (int i = endY - 1; i >= start; --i)
			{
				int number = numbers[endX][i];
				System.out.print(number + " ");
			}
		}

		//从下到上打印一列
		if (start < endY && start < endX - 1)
		{
			for (int i = endX - 1; i >= start + 1; --i)
			{
				int number = numbers[i][start];
				System.out.print(number + " ");
			}
		}
	}
}
