package problem13;

import utils.ListNode;

/**
 * 给定一个单向链表的头结点和要删除的节点，要求O（1）删除该节点
 * Created by bjyangrubing on 2016/8/16.
 */
public class DeleteNodeInList
{
	public void deleteNode(ListNode head, ListNode node)
	{
		if (node == null || head == null)
			return;
		if (head == node)
		{
			head = null;
		}
		//要删除的节点为尾节点
		if (node.next == null)
		{
			while (head.next.next != null)//找到最后一个节点的前一个节点
			{
				head = head.next;
			}
			head.next = null;

		}
		else//要删除的节点不是尾节点
		{
			node.value = node.next.value;
			node.next = node.next.next;
		}
	}

}
