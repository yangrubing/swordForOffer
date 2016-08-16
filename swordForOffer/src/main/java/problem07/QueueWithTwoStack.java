package problem07;

import java.util.Stack;

/**
 * 两个栈实现一个队列
 * @author bjyangrubing
 *
 */
public class QueueWithTwoStack
{
	/*用两个栈实现一个队列，完成两个函数appendTail和deletedHead，分别是在队列尾部插入节点和
	在队列头部删除节点的功能*/
	private Stack<String> stack1 = new Stack<String>();
	private Stack<String> stack2 = new Stack<String>();

	public void appendTail(String elem)
	{
		stack1.push(elem);
	}

	public String deletedHead() throws Exception
	{
		while (!stack1.isEmpty())//如果栈1不为空，则把栈1的元素全部push到栈2
		{
			stack2.push(stack1.pop());
		}

		if (stack2.size() == 0)
			throw new Exception("queue is empty");
		String head = stack2.pop();//从栈2里面出栈
		return head;
	}

}
