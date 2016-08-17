package utils;

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

	public static void preOrder(BinaryTreeNode root)
	{
		if (root == null)
			return;
		System.out.println(root.value);
		preOrder(root.leftNode);
		preOrder(root.rightNode);
	}

	public static void inOrder(BinaryTreeNode root)
	{
		if (root == null)
			return;
		preOrder(root.leftNode);
		System.out.println(root.value);
		preOrder(root.rightNode);
	}

	public static void postOrder(BinaryTreeNode root)
	{
		if (root == null)
			return;
		preOrder(root.leftNode);
		preOrder(root.rightNode);
		System.out.println(root.value);
	}

}
