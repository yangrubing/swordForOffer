package problem44;

import java.util.Arrays;

/**
 * Created by bjyangrubing on 2016/8/25.
 */
public class ContinousCard {
    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length != 5)
            return false;
        int numberOfZero = 0;
        int numberOfGap = 0;
        int indexOfLastZero = Integer.MAX_VALUE;
        //先排序
        Arrays.sort(numbers);
        //计算最后一个0的位置
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                indexOfLastZero = i - 1;
                break;
            }
            numberOfZero++;
        }
        //从最后一个0的位置+1开始，计算缺的数字
        int i = indexOfLastZero + 1, j = i + 1;
        for (; i < numbers.length - 1 && j < numbers.length; i++, j++) {
            if (numbers[j] - numbers[i] == 0) {
                return false;
            }

            numberOfGap += numbers[j] - numbers[i] - 1;
        }

        if (numberOfZero >= numberOfGap)
            return true;
        return false;

    }
}
