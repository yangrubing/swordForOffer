package problem18;

import utils.BinaryTreeNode;

/**
 * 树的子结构，判断
 * Created by bjyangrubing on 2016/8/17.
 */
public class SubstructureInTree
{

	public boolean hasSubTree(BinaryTreeNode treeA, BinaryTreeNode treeB)
	{
		if (treeB == null)//首先判断如果，如果B为空树，返回true
			return true;
		if (treeA == null)//如果B不为null，A为null返回false
			return false;

		boolean result = false;

		if (treeA != null && treeB != null)
		{
			if (treeA.value == treeB.value)
				result = doesTreeAHasTreeB(treeA, treeB);//判断以当前节点为根节点的数是不是和treeB相同
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

	public static void main(String[] args)
	{
		BinaryTreeNode rootA = new BinaryTreeNode(8);
		BinaryTreeNode a_node1 = new BinaryTreeNode(8);
		BinaryTreeNode a_node2 = new BinaryTreeNode(7);
		BinaryTreeNode a_node3 = new BinaryTreeNode(9);
		BinaryTreeNode a_node4 = new BinaryTreeNode(2);
		BinaryTreeNode a_node5 = new BinaryTreeNode(4);
		BinaryTreeNode a_node6 = new BinaryTreeNode(7);
		rootA.leftNode = a_node1;
		rootA.rightNode = a_node2;

		a_node1.leftNode = a_node3;
		a_node1.rightNode = a_node4;

		a_node4.leftNode = a_node5;
		a_node4.rightNode = a_node6;

		BinaryTreeNode rootB = new BinaryTreeNode(8);
		BinaryTreeNode b_node1 = new BinaryTreeNode(9);
		BinaryTreeNode b_node2 = new BinaryTreeNode(2);

		rootB.leftNode = b_node1;
		rootB.rightNode = b_node2;

		SubstructureInTree substructureInTree = new SubstructureInTree();
		boolean result = substructureInTree.hasSubTree(rootA, rootB);
		System.out.println(result);
	}
}
