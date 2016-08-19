package problem26;

import java.util.LinkedHashSet;
import java.util.Set;

/**输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * Created by bjyangrubing on 2016/8/19.
 */
public class CopyComplexList
{
	public RandomListNode clone(RandomListNode pHead)
	{
		cloneNodes(pHead);
		connectSublingNodes(pHead);
		RandomListNode result = reconnectNodes(pHead);
		return result;
	}

	/**首先复制节点*/
	private void cloneNodes(RandomListNode pHead)
	{
		RandomListNode pNode = pHead;
		while (pNode != null)
		{
			RandomListNode pCloned = new RandomListNode(pNode.label);
			pCloned.next = pNode.next;
			pNode.next = pCloned;
			pNode = pCloned.next;

		}
	}

	Set<String> set = new LinkedHashSet<String>();

	/**连接随机节点*/
	private void connectSublingNodes(RandomListNode pHead)
	{
		RandomListNode pNode = pHead;
		while (pNode != null)
		{
			RandomListNode pCloned = pNode.next;
			//如果当前节点有随机节点
			if (pNode.random != null)
			{
				//克隆节点的随机节点为当前节点的随机节点的下一个
				pCloned.random = pNode.random.next;
			}
			pNode = pCloned.next;
		}
	}

	/**拆分节点，奇数位置上的节点组成原始链表，偶数位置上的组成复制后的链表*/
	private RandomListNode reconnectNodes(RandomListNode pHead)
	{
		RandomListNode pNode = pHead;
		RandomListNode pClonedHead = null;
		RandomListNode pClonedNode = null;

		if (pNode != null)
		{
			pClonedHead = pClonedNode = pNode.next;
			pNode.next = pClonedNode.next;
			pNode = pNode.next;
		}

		while (pNode != null)
		{
			pClonedNode.next = pNode.next;
			pClonedNode = pClonedNode.next;
			pNode.next = pClonedNode.next;
			pNode = pNode.next;
		}
		return pClonedHead;
	}

}

class RandomListNode
{
	int label;
	RandomListNode next = null;
	RandomListNode random = null;

	RandomListNode(int label)
	{
		this.label = label;
	}
}
