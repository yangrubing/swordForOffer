package problem23;

import utils.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**从上往下打印出二叉树的每个节点，同层节点从左至右打印。二叉树的层次遍历
 * Created by bjyangrubing on 2016/8/17.
 */
public class PrintFromTopToBottom
{

	/*层次遍历二叉树
	* 借助辅助的队列，把左子树右子树分别加到FIFO的队列中，然后输出就行了
	* **/
	public ArrayList<Integer> printFromTopToBottom(BinaryTreeNode root)
	{
		if (root == null)
			return null;
		//LinkedList实现了Queue接口
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		ArrayList<Integer> rtList = new ArrayList<Integer>();
		while (!queue.isEmpty())
		{
			BinaryTreeNode node = queue.poll();
			rtList.add(node.value);

			if (node.leftNode != null)
			{
				queue.add(node.leftNode);
			}
			if (node.rightNode != null)
			{
				queue.add(node.rightNode);
			}
		}
		return rtList;
	}
}
