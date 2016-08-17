package problem21;

import java.util.Stack;

/**定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * Created by bjyangrubing on 2016/8/17.
 */
public class MinInStack
{
	private Stack<Integer> dataStack = new Stack<Integer>();
	/**辅助栈， 保存的是每次入栈时的daatStack中的最小值*/
	private Stack<Integer> minStack = new Stack<Integer>();

	public void push(int node)
	{
		//将node压栈
		dataStack.push(node);
		//如果辅助栈为空，则直接压入节点
		if (minStack.isEmpty())
		{
			minStack.push(node);
		}
		else
		{
			//否则，辅助栈压入node和minStack.peek()中的最小值
			minStack.push(Math.min(minStack.peek(), node));
		}

	}

	public void pop()
	{
		dataStack.pop();
		minStack.pop();
	}

	public int top()
	{
		return dataStack.peek();
	}

	public int min()
	{
		return minStack.peek();
	}
}
