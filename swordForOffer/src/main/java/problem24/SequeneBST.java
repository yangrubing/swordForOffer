package problem24;

import java.util.Arrays;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * Created by bjyangrubing on 2016/8/18.
 */
public class SequeneBST
{
	public boolean verifySquenceOfBST(int[] sequence)
	{
		if (sequence == null || sequence.length <= 0)
			return false;
		int length = sequence.length;
		int root = sequence[length - 1];//后序结果， 最后一个元素为根节点

		int i = 0;
		for (; i < length - 1; i++)
		{
			if (root < sequence[i])//从左向右，找第一个大于root的下标，确定左子树的范围
				break;
		}

		int j = i;
		//遍历右子树，如果右子树的值小于root，则直接返回false
		for (; j < length - 1; j++)
		{
			if (root > sequence[j])
				return false;
		}
		//判断左子树是否为BST,只有当i>0时才有左子树
		boolean left = true;
		if (i > 0)
		{
			verifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
		}
		//判断右子树是否为BST,只有当i<length-1时才有右子树
		boolean right = true;
		if (i < length - 1)
		{
			verifySquenceOfBST(Arrays.copyOfRange(sequence, i, length - 1));
		}

		return left && right;
	}

	public static void main(String[] args)
	{
		int[] sequence =
		{ 5, 7, 6, 9, 11, 10, 8 };
		SequeneBST s = new SequeneBST();
		boolean result = s.verifySquenceOfBST(sequence);
		System.out.println(result);
	}
}
