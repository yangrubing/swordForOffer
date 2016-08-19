package problem26;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/19.
 */
public class CopyComplexListTest
{
	@Test
	public void test()
	{
		RandomListNode head = new RandomListNode(1);
		RandomListNode node1 = new RandomListNode(2);
		RandomListNode node2 = new RandomListNode(3);
		RandomListNode node3 = new RandomListNode(4);
		RandomListNode node4 = new RandomListNode(5);
		RandomListNode node5 = new RandomListNode(6);
		head.next = node1;
		head.random = node3;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node1.random = node5;

		CopyComplexList c = new CopyComplexList();
		RandomListNode cHead = c.clone(head);
		Assert.assertEquals(1, cHead.label);

		Assert.assertEquals(4, cHead.random.label);

		Assert.assertEquals(null, node2.random);

	}

}
