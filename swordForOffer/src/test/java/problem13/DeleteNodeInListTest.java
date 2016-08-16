package problem13;

import org.junit.Test;
import utils.ListNode;

/**
 * Created by bjyangrubing on 2016/8/16.
 */
public class DeleteNodeInListTest
{
	@Test
	public void test()
	{
		ListNode head = new ListNode();
		ListNode second = new ListNode();
		ListNode third = new ListNode();
		head.next = second;
		second.next = third;
		head.value = 1;
		second.value = 2;
		third.value = 3;
		DeleteNodeInList testDeleteNode = new DeleteNodeInList();
		testDeleteNode.deleteNode(head, third);
		System.out.println(head.next.next);

	}
}
