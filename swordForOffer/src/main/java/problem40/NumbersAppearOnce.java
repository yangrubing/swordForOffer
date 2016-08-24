package problem40;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * Created by bjyangrubing on 2016/8/24.
 */
public class NumbersAppearOnce {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length <= 0)
            return;

        //异或的结果值，任何数和0异或还是本身
        int resultExclusiveOR = 0;
        for (int i = 0; i < array.length; i++) {
            resultExclusiveOR ^= array[i];
        }

        int indexOf1 = findFirst1Index(resultExclusiveOR);
        num1[0] = 0;
        num2[0] = 0;
        for (int i = 0; i < array.length; i++) {
            if (isBit1(array[i], indexOf1)) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }

    }

    /**
     * 第index位是否为1
     *
     * @param number
     * @param index
     * @return
     */
    public boolean isBit1(int number, int index) {
        number = number >> index;
        return (number & 1) == 1;
    }

    /**
     * 从右至左返回1的位置
     *
     * @param i
     * @return
     */
    public int findFirst1Index(int i) {
        int index = 0;
        while ((i & 1) == 0) {
            i = i >> 1;
            index++;
        }

        return index;
    }
}
