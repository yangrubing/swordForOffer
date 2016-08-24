package problem37;

import junit.framework.Assert;
import org.junit.Test;
import utils.ListNode;

/**
 * Created by bjyangrubing on 2016/8/23.
 */
public class FirstCommonNodesInListsTest
{
	@Test
	public void test()
	{
		ListNode pHead1 = new ListNode();
		ListNode pHead2 = new ListNode();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		pHead1.next = node2;
		pHead2.next = node1;

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		FirstCommonNodesInLists f = new FirstCommonNodesInLists();

		Assert.assertEquals(2, f.FindFirstCommonNode(pHead1, pHead2).value);

	}
}
