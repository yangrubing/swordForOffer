package problem06;

import java.security.InvalidParameterException;
import java.util.Arrays;

import utils.BinaryTreeNode;

/**
 * 输入前序和中序遍历结果，重建二叉树
 * @author bjyangrubing
 *
 */
public class ContructBinaryTree
{
	public static BinaryTreeNode construct(int[] preOrder, int[] inorder) throws Exception
	{
		if (preOrder == null || inorder == null || preOrder.length != inorder.length)
		{
			throw new InvalidParameterException("输入不合法。");
		}
		BinaryTreeNode root = new BinaryTreeNode();
		for (int i = 0; i < inorder.length; i++)//遍历中序序列，确定root以及左右子树的范围
		{

			if (inorder[i] == preOrder[0])
			{
				root.value = inorder[i];
				//递归生成左子树
				root.leftNode = construct(Arrays.copyOfRange(preOrder, 1, i + 1), Arrays.copyOfRange(inorder, 0, i));
				//递归生成右子树
				root.rightNode = construct(Arrays.copyOfRange(preOrder, i + 1, preOrder.length),
						Arrays.copyOfRange(inorder, i + 1, inorder.length));
			}
		}

		return root;
	}

	/**
	 * 先序遍历
	 * @param root
	 */
	public static void preOrder(BinaryTreeNode root)
	{
		if (root != null)
		{
			if (root.value != null)
				System.out.println(root.value);
			preOrder(root.leftNode);
			preOrder(root.rightNode);
		}

	}

	/**
	 * 中序遍历
	 * @param root
	 */
	public static void inOrder(BinaryTreeNode root)
	{
		if (root != null)
		{
			inOrder(root.leftNode);
			if (root.value != null)
				System.out.println(root.value);
			inOrder(root.rightNode);
		}

	}

}
