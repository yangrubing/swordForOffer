package problem39;

import utils.BinaryTreeNode;

/**输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * Created by bjyangrubing on 2016/8/24.
 */
public class TreeDepth
{
	public int TreeDepth(BinaryTreeNode pRoot)
	{
		if (pRoot == null)
			return 0;

		int left = TreeDepth(pRoot.leftNode);
		int right = TreeDepth(pRoot.rightNode);

		return left > right ? left + 1 : right + 1;
	}

	/**判断一棵树是否为平衡二叉树*/
	public boolean IsBalanced_Solution(BinaryTreeNode pRoot)
	{
		if (pRoot == null)
			return true;

		int left = TreeDepth(pRoot.leftNode);
		int right = TreeDepth(pRoot.rightNode);
		int diff = left - right;
		if (diff < -1 || diff > 1)
			return false;
		return IsBalanced_Solution(pRoot.leftNode) && IsBalanced_Solution(pRoot.rightNode);

	}

}
