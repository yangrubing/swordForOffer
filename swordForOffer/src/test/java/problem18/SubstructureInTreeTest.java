package problem18;

import org.junit.Assert;
import org.junit.Test;
import utils.BinaryTreeNode;

/**
 * Created by bjyangrubing on 2016/8/17.
 */
public class SubstructureInTreeTest
{
	@Test
	public void test()
	{
		BinaryTreeNode rootA = new BinaryTreeNode(8);
		BinaryTreeNode a_node1 = new BinaryTreeNode(8);
		BinaryTreeNode a_node2 = new BinaryTreeNode(7);
		BinaryTreeNode a_node3 = new BinaryTreeNode(9);
		BinaryTreeNode a_node4 = new BinaryTreeNode(2);
		BinaryTreeNode a_node5 = new BinaryTreeNode(4);
		BinaryTreeNode a_node6 = new BinaryTreeNode(7);
		rootA.leftNode = a_node1;
		rootA.rightNode = a_node2;

		a_node1.leftNode = a_node3;
		a_node1.rightNode = a_node4;

		a_node4.leftNode = a_node5;
		a_node4.rightNode = a_node6;

		BinaryTreeNode rootB = new BinaryTreeNode(8);
		BinaryTreeNode b_node1 = new BinaryTreeNode(9);
		BinaryTreeNode b_node2 = new BinaryTreeNode(2);

		rootB.leftNode = b_node1;
		rootB.rightNode = b_node2;

		SubstructureInTree substructureInTree = new SubstructureInTree();

		Assert.assertEquals(true, substructureInTree.hasSubTree(rootA, rootB));

	}
}
