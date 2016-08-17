package problem19;

import utils.BinaryTreeNode;

/**二叉树的镜像
 * 输入一个二叉树，该函数输出他的镜像.
 * 二叉树的镜像定义：
 * 源二叉树 
             8
            /  \
           6   10
          / \  / \
         5  7 9  11
 镜像二叉树
            8
          /  \
         10   6
         / \ / \
        11 9 7  5
 * Created by bjyangrubing on 2016/8/17.
 */
public class MirrorOfBinaryTree
{

	public void mirrorRecursively(BinaryTreeNode root)
	{
		if (root == null)
			return;
		//如果为叶子节点,则return
		if (root.leftNode == null && root.rightNode == null)
			return;

		//交换左右节点
		BinaryTreeNode temp = root.leftNode;
		root.leftNode = root.rightNode;
		root.rightNode = temp;

		if (root.leftNode != null)
		{
			//递归交换左子树
			mirrorRecursively(root.leftNode);
		}

		if (root.rightNode != null)
		{
			//递归交换右子树
			mirrorRecursively(root.rightNode);
		}
	}

	public static void main(String[] args)
	{

	}

}
