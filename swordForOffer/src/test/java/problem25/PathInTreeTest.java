package problem25;

import org.junit.Test;
import utils.BinaryTreeNode;
import utils.ListNode;

/**
 * Created by bjyangrubing on 2016/8/18.
 */
public class PathInTreeTest
{
	@Test
	public void test()
	{
		ListNode head1 = new ListNode();
		ListNode head2 = new ListNode();
		head2.value = head1.value;
		while (head1.next != null)
		{
			ListNode hNext = head1.next;
			ListNode newNode = null;
			if (hNext == null)
			{
				head2.next = null;
			}
			else
			{
				newNode = new ListNode();
				newNode.value = hNext.value;
				head2.next = newNode;
			}

			head1 = hNext;
			head2 = newNode;

		}

		BinaryTreeNode root = new BinaryTreeNode();
		BinaryTreeNode node1 = new BinaryTreeNode();
		BinaryTreeNode node2 = new BinaryTreeNode();
		BinaryTreeNode node3 = new BinaryTreeNode();
		BinaryTreeNode node4 = new BinaryTreeNode();
		BinaryTreeNode node5 = new BinaryTreeNode();

		PathInTree pathInTree = new PathInTree();

	}

}
