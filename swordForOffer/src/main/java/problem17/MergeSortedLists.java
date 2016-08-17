package problem17;

import utils.ListNode;

/**合并两个排序的列表
 * 合并两个链表并使新链表中的节点仍然是递增排序的
 * Created by bjyangrubing on 2016/8/17.
 */
public class MergeSortedLists
{

	public ListNode merge(ListNode head1, ListNode head2)
	{

		//递归的基准情况
		if (head1 == null)
			return head2;
		else if (head2 == null)
			return head1;

		ListNode mHead = null;
		//如果head1的值<head2的值，则将合并后的头设置为head1
		if (head1.value < head2.value)
		{
			mHead = head1;
			mHead.next = merge(head1.next, head2);//递归合并剩余链表
		}
		else
		{
			mHead = head2;
			mHead.next = merge(head1, head2.next);
		}
		return mHead;
	}

}
