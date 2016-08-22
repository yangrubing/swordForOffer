package problem32;

/**
 * 输出从1到n的数字中1
 * 的个数
 * Created by bjyangrubing on 2016/8/22.
 */
public class NumberOf1 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int number = 0;
        //计算每个数字的1的个数并相加
        for (int i = 1; i <= n; i++) {
            number += numberOf1(i);
        }
        return number;
    }

    private int numberOf1(int i) {
        int count = 0;
        while (i != 0) {
            if (i % 10 == 1) {//最低位是否为1
                count++;
            }
            i /= 10;
        }
        return count;
    }

}
