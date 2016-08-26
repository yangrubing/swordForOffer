package problem45;

import java.util.ArrayList;

/**
 * 0,1,2,.....,n-1这n个数字排成一个圆圈，从数字0开始每次删除圆圈内的第m个数字，求最后剩下的那个数字。
 * Created by bjyangrubing on 2016/8/25.
 */
public class LastNumberInCircle {
    public int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 1)
            return -1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        int begin = 0;
        int removeIndex = (m - 1) % n;

        while (list.size() > 1) {
            list.remove((int) removeIndex);
            begin = removeIndex % list.size();
            removeIndex = (begin + m - 1) % list.size();
        }
        return list.get(0);

    }


}
