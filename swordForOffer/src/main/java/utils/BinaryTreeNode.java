package utils;

import java.util.Stack;

public class BinaryTreeNode
{
	public int value;

	public BinaryTreeNode()
	{
	}

	public BinaryTreeNode(int value)
	{
		this.value = value;
	}

	public BinaryTreeNode leftNode;

	public BinaryTreeNode rightNode;

	/**
	 * 先序遍历递归
	 * @param root 根节点
	 */
	public static void preOrder(BinaryTreeNode root)
	{
		if (root == null)
			return;
		System.out.println(root.value);
		preOrder(root.leftNode);
		preOrder(root.rightNode);
	}

	/**
	 * 先序遍历非递归实现
	 */
	public static void preOrderNotRecrusively(BinaryTreeNode root)
	{
		if (root == null)
			return;
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();

		stack.push(root);

		while (!stack.isEmpty())
		{
			BinaryTreeNode node = stack.pop();
			System.out.println(node.value);

			if (node.rightNode != null)
				stack.push(node.rightNode);

			if (node.leftNode != null)
				stack.push(node.leftNode);
		}

	}

	/**
	 * 中序遍历递归
	 * @param root 根节点
	 */
	public static void inOrder(BinaryTreeNode root)
	{
		if (root == null)
			return;
		preOrder(root.leftNode);
		System.out.println(root.value);
		preOrder(root.rightNode);
	}

	/**
	 * 二叉树中序遍历非递归
	 */
	public static void inOrderNotRecrusively(BinaryTreeNode root)
	{
		if (root == null)
			return;
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();

		BinaryTreeNode node = root;

		while (node != null || stack.size() != 0)
		{
			//将所有的左子树入栈
			while (node != null)
			{
				stack.push(node);
				node = node.leftNode;
			}

			if (!stack.isEmpty())
			{
				node = stack.pop();
				System.out.println(node.value);
				node = node.rightNode;
			}
		}

	}

	/**
	 * 后序遍历非递归
	 */
	public static void postOrderNotRecrusively(BinaryTreeNode root)
	{

		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		Stack<BinaryTreeNode> temp = new Stack<BinaryTreeNode>();//辅助栈
		BinaryTreeNode node = root;
		while (node != null || stack.size() > 0)
		{
			while (node != null)
			{
				temp.push(node);
				stack.push(node);
				node = node.rightNode;
			}
			if (stack.size() > 0)
			{
				node = stack.pop();
				node = node.leftNode;
			}
		}
		while (temp.size() > 0)
		{
			node = temp.pop();
			System.out.println(node.value);
		}
	}

	/**
	 * 后序遍历递归
	 * @param root 根节点
	 */
	public static void postOrder(BinaryTreeNode root)
	{
		if (root == null)
			return;
		preOrder(root.leftNode);
		preOrder(root.rightNode);
		System.out.println(root.value);
	}

}
