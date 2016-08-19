package problem27;

/**
 *输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * 思想：采用中序遍历，且转换后的链表根节点为中序遍历左子树的根节点。
 * Created by bjyangrubing on 2016/8/19.
 */

class TreeNode
{
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val)
	{
		this.val = val;

	}

}

public class ConvertBinarySearchTree
{
	public TreeNode Convert(TreeNode pRootOfTree)
	{
		if (pRootOfTree == null)
			return null;
		//如果是叶子节点则直接返回
		if (pRootOfTree.left == null && pRootOfTree.right == null)
		{
			return pRootOfTree;
		}

		//1.得到转换后的左子树链表
		TreeNode left = Convert(pRootOfTree.left);
		TreeNode p = left;

		//2.遍历得到的左子树链表，得到最后一个节点，该节点应该是左子树中最大的节点，和根节点相连
		while (p != null && p.right != null)
		{
			p = p.right;
		}
		//3.如果有左子树链表，则将左子树链表的最后一个节点p和根节点相连
		if (left != null)
		{
			p.right = pRootOfTree;
			pRootOfTree.left = p;
		}

		//4.得到右子树链表
		TreeNode right = Convert(pRootOfTree.right);

		//5.如果有右子树链表，则将右子树链表和根节点相连
		if (right != null)
		{
			pRootOfTree.right = right;
			right.left = pRootOfTree;
		}

		//6. 返回如果左子树的节点为null，则返回根节点
		return left == null ? pRootOfTree : left;

	}

}
