package problem37;

import utils.ListNode;

/**输入两个链表，找出它们的第一个公共结点。
 * Created by bjyangrubing on 2016/8/23.
 */
public class FirstCommonNodesInLists
{
	/**
	 * 思路：先找出两个链表的长度差值k，让长的链表先走k步
	 * 然后让两个链表一起走，一直遇到相同的节点则返回
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2)
	{
		if (pHead1 == null || pHead2 == null)
			return null;
		int length1 = getListLength(pHead1);
		int length2 = getListLength(pHead2);
		//两个链表的长度差值
		int diff = (length1 - length2);
		int i = 0;
		//链表1比链表2长
		if (diff > 0)
		{
			while (i < diff)
			{
				pHead1 = pHead1.next;
				i++;
			}
		}
		else
		{
			while (diff < i)
			{
				pHead2 = pHead2.next;
				diff++;
			}
		}

		ListNode rtNode = new ListNode();

		while (pHead1 != null && pHead2 != null)
		{
			if (pHead1.value == pHead2.value)
			{
				rtNode = pHead1;
				break;
			}
			else
			{
				pHead1 = pHead1.next;
				pHead2 = pHead2.next;
			}

		}

		return rtNode;
	}

	private int getListLength(ListNode phead)
	{
		int count = 0;
		while (phead != null)
		{
			count++;
			phead = phead.next;
		}

		return count;
	}
}
