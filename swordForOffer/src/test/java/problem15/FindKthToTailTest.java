package problem15;

import org.junit.Assert;
import org.junit.Test;
import utils.ListNode;

/**
 * Created by yrb on 2016/8/16.
 */
public class FindKthToTailTest {
    @Test
    public void test() {
        ListNode six = new ListNode();
        ListNode one = new ListNode();
        ListNode two = new ListNode();
        ListNode three = new ListNode();
        ListNode four = new ListNode();
        ListNode five = new ListNode();
        one.value = 1;
        two.value = 2;
        three.value = 3;
        four.value = 4;
        five.value = 5;
        six.value = 6;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        Assert.assertEquals(3, new FindKthToTail().findKthToTail(one, 4).value);

        Assert.assertEquals(null, new FindKthToTail().findKthToTail(one, 0));

        Assert.assertEquals(null, new FindKthToTail().findKthToTail(one, 8));

        Assert.assertEquals(null, new FindKthToTail().findKthToTail(null, 1));
    }
}
