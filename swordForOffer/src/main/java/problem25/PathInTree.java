package problem25;

import utils.BinaryTreeNode;

import java.util.ArrayList;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * Created by bjyangrubing on 2016/8/18.
 */
public class PathInTree {

    //返回的list
    private ArrayList<ArrayList<Integer>> rtList = new ArrayList<ArrayList<Integer>>();

    //存储当前路径的list
    private ArrayList<Integer> currentList = new ArrayList<Integer>();

    public ArrayList<ArrayList<Integer>> FindPath(BinaryTreeNode root, int target) {
        //首先判断root是否为null,为null直接返回rtList
        if (root == null)
            return rtList;
        currentList.add(root.value);
        target -= root.value;

        FindPath(root.leftNode, target);
        FindPath(root.rightNode, target);
        //如果是叶子节点，且target == 0，说明这个路径是正确的，添加到rtList中
        if (target == 0 && root.leftNode == null && root.rightNode == null) {
            rtList.add(new ArrayList<Integer>(currentList));
        }
        //在递归返回之前，将路径的最后一个值移除掉
        currentList.remove(currentList.size() - 1);

        return rtList;

    }
}
