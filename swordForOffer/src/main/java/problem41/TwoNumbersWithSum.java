package problem41;

import java.util.ArrayList;

/**
 * Created by bjyangrubing on 2016/8/25.
 */
public class TwoNumbersWithSum {

    ArrayList<ArrayList<Integer>> rtList = new ArrayList<ArrayList<Integer>>();

    /**
     * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
     *
     * @param array
     * @param sum
     * @return
     */
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> rtList = new ArrayList<Integer>();
        if (array == null || array.length <= 0)
            return rtList;

        for (int i = 0, j = array.length - 1; i < array.length - 1 && i < j; ) {
            if (array[i] + array[j] == sum) {
                rtList.add(array[i]);
                rtList.add(array[j]);
                break;
            } else if (array[i] + array[j] < sum) {
                i++;
            } else
                j--;
        }

        return rtList;
    }

    /**
     * 输入一个整数s，打印出所有和为s的连续正数序列.
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        if (sum < 3)
            return rtList;
        int small = 1;
        int big = 2;

        int middle = (1 + sum) / 2; //small的终止条件
        int curSum = small + big;

        while (small < middle) {
            if (curSum == sum) {
                addToRtList(small, big);
            }

            while (small < middle && curSum > sum) {
                curSum -= small;
                small++;
                if (curSum == sum) {
                    addToRtList(small, big);
                }
            }
            big++;
            curSum += big;

        }

        return rtList;
    }

    private void addToRtList(int small, int big) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = small; i <= big; i++) {
            list.add(i);
        }

        rtList.add(list);
    }
}
