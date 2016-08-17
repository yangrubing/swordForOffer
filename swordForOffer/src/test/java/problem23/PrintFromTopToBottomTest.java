package problem23;

import org.junit.Assert;
import org.junit.Test;
import utils.BinaryTreeNode;

import java.util.ArrayList;

/**
 * Created by bjyangrubing on 2016/8/17.
 */
public class PrintFromTopToBottomTest
{

	@Test
	public void test()
	{
		BinaryTreeNode rootA = new BinaryTreeNode(1);
		BinaryTreeNode a_node1 = new BinaryTreeNode(2);
		BinaryTreeNode a_node2 = new BinaryTreeNode(3);
		BinaryTreeNode a_node3 = new BinaryTreeNode(4);
		BinaryTreeNode a_node4 = new BinaryTreeNode(5);
		BinaryTreeNode a_node5 = new BinaryTreeNode(6);
		BinaryTreeNode a_node6 = new BinaryTreeNode(7);
		rootA.leftNode = a_node1;
		rootA.rightNode = a_node2;

		a_node1.leftNode = a_node3;
		a_node1.rightNode = a_node4;

		a_node2.leftNode = a_node5;
		a_node2.rightNode = a_node6;

		PrintFromTopToBottom p = new PrintFromTopToBottom();
		ArrayList<Integer> rtList = p.printFromTopToBottom(rootA);

		Assert.assertArrayEquals(new Object[]
		{ 1, 2, 3, 4, 5, 6, 7 }, rtList.toArray());
	}
}
