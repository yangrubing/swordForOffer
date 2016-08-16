package problem05;

import java.util.Stack;

import utils.ListNode;

/**
 * 倒序打印列表，利用栈
 * @author bjyangrubing
 *
 */
public class PrintListReversingly
{
	/**
	 * 利用栈
	 * @param head
	 */
	public static void printListReversingly(ListNode head)
	{
		if (head == null)
		{
			return;
		}
		Stack<ListNode> stack = new Stack<ListNode>();
		while (head != null)
		{
			stack.push(head);
			head = head.next;
		}

		while (!stack.isEmpty())
		{
			ListNode node = stack.pop();
			System.out.println(node.value);
		}
	}

	/**
	 * 利用递归
	 * @param head
	 */
	public static void printListReversingly1(ListNode head)
	{
		if (head != null)
		{
			if (head.next != null)
			{
				printListReversingly1(head.next);
			}
			System.out.println(head.value);
		}
	}

}
