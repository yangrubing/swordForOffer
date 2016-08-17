package problem17;

import org.junit.Test;
import utils.ListNode;

/**
 * Created by bjyangrubing on 2016/8/17.
 */
public class MergeSortedListsTest
{
	@Test
	public void test()
	{
		ListNode l1_node1 = new ListNode();
		ListNode l1_node2 = new ListNode();
		ListNode l1_node3 = new ListNode();
		l1_node1.value = 1;
		l1_node2.value = 2;
		l1_node3.value = 3;
		l1_node1.next = l1_node2;
		l1_node2.next = l1_node3;

		ListNode l2_node1 = new ListNode();
		ListNode l2_node2 = new ListNode();
		ListNode l2_node3 = new ListNode();
		l2_node1.value = 4;
		l2_node2.value = 5;
		l2_node3.value = 6;
		l2_node1.next = l2_node2;
		l2_node2.next = l2_node3;

		MergeSortedLists m = new MergeSortedLists();
		ListNode mHead = m.merge(l1_node1, l2_node1);
		while (mHead != null)
		{
			System.out.println(mHead.value);
			mHead = mHead.next;
		}
	}

}
