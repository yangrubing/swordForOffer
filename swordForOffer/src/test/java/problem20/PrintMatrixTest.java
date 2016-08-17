package problem20;

import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/17.
 */
public class PrintMatrixTest
{

	@Test
	public void test()
	{
		int[][] matrix =
		{
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		PrintMatrix printMatrix = new PrintMatrix();
		printMatrix.printMatrix(matrix, 4, 4);
	}
}
