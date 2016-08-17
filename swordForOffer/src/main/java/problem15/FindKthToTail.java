package problem15;

import utils.ListNode;

/**
 * 输出该链表中倒数第K个节点
 * 注意三点：
 * 1. 输入的k为0或者负数，直接返回null
 * 2. 输入的head为null的时候直接返回null
 * 3. 如果输入的k大于链表的长度，则返回null
 * Created by yrb on 2016/8/16.
 */
public class FindKthToTail
{

	public ListNode findKthToTail(ListNode head, int k)
	{
		if (k <= 0 || head == null)
		{
			return null;
		}

		//设置两个指针，一个快，一个慢
		ListNode aHead = head;
		ListNode behind = null;
		//快的先走k-1步
		for (int i = 0; i < k - 1; i++)
		{
			if (aHead.next != null)
				aHead = aHead.next;
			else
				return null;//如果k大于链表的长度，则直接返回null
		}
		//这时慢的指向第一个节点
		behind = head;
		//快的和慢的一起走，当快的走到末尾的时候，慢的指向的就是倒数第K个
		while (aHead.next != null)
		{

			aHead = aHead.next;
			behind = behind.next;
		}
		return behind;
	}

}
