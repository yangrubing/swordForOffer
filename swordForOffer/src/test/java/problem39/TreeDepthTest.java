package problem39;

import org.junit.Assert;
import org.junit.Test;
import utils.BinaryTreeNode;

/**
 * Created by bjyangrubing on 2016/8/24.
 */
public class TreeDepthTest
{

	@Test
	public void test()
	{
		TreeDepth t = new TreeDepth();
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode node1 = new BinaryTreeNode(2);
		BinaryTreeNode node2 = new BinaryTreeNode(3);
		BinaryTreeNode node3 = new BinaryTreeNode(4);
		BinaryTreeNode node4 = new BinaryTreeNode(5);
		BinaryTreeNode node5 = new BinaryTreeNode(6);
		BinaryTreeNode node6 = new BinaryTreeNode(7);

		root.leftNode = node1;
		root.rightNode = node2;

		node1.leftNode = node3;
		node1.rightNode = node4;

		node2.rightNode = node5;
		node4.leftNode = node6;

		Assert.assertEquals(4, t.TreeDepth(root));

		Assert.assertEquals(true, t.IsBalanced_Solution(root));

	}
}
