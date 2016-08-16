package problem05;

import org.junit.Test;

import utils.ListNode;

public class PrintListReversinglyTest
{
	@Test
	public void test()
	{
		ListNode head = new ListNode();
		ListNode node1 = new ListNode();
		ListNode node2 = new ListNode();
		head.value = 1;
		node1.value = 2;
		node2.value = 3;
		head.next = node1;
		node1.next = node2;
		PrintListReversingly.printListReversingly1(head);
	}
}
