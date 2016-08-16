package problem06;

import org.junit.Test;

import utils.BinaryTreeNode;

public class ContructBinaryTreeTest
{
	@Test
	public void test() throws Exception
	{
		BinaryTreeNode root = ContructBinaryTree.construct(new int[]
		{ 1, 2, 4, 7, 3, 5, 6, 8 }, new int[]
		{ 4, 7, 2, 1, 5, 3, 8, 6 });

		ContructBinaryTree.inOrder(root);
		ContructBinaryTree.preOrder(root);
	}

}
