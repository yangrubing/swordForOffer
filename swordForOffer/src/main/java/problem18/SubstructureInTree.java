package problem18;

import utils.BinaryTreeNode;

/**
 * 树的子结构
 * Created by bjyangrubing on 2016/8/17.
 */
public class SubstructureInTree
{
	/**输入两个树A, B，判断A是否包含B*/
	public boolean hasSubTree(BinaryTreeNode treeA, BinaryTreeNode treeB)
	{
		if (treeB == null)//首先判断如果B为空树，返回true
			return true;
		if (treeA == null)//如果B不为null，A为null返回false
			return false;

		boolean result = false;

		if (treeA != null && treeB != null)
		{
			//首先从根节点进行判断，如果值相同，则判断以当前节点为根节点的树A是否包含树B
			if (treeA.value == treeB.value)
				result = doesTreeAHasTreeB(treeA, treeB);//判断以当前节点为根节点的树是不是和treeB相同
			if (!result)
				result = hasSubTree(treeA.leftNode, treeB) || hasSubTree(treeA.rightNode, treeB);
		}
		return result;
	}

	private boolean doesTreeAHasTreeB(BinaryTreeNode treeA, BinaryTreeNode treeB)
	{
		if (treeB == null)//首先判断如果，如果B为空树，返回true
			return true;
		if (treeA == null)//如果B不为null，A为null返回false
			return false;
		if (treeA.value != treeB.value)//如果两个节点的值不相同，则直接返回false
			return false;
		//递归判断treeA和treeB的节点是否相同
		return doesTreeAHasTreeB(treeA.leftNode, treeB.leftNode) && doesTreeAHasTreeB(treeA.rightNode, treeB.rightNode);
	}
}
