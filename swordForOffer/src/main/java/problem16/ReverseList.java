package problem16;

import utils.ListNode;

/**
 * 反转链表
 * Created by yrb on 2016/8/16.
 */
public class ReverseList {

    public ListNode reverseList(ListNode pHead) {
        ListNode pReverseHead = null;//反转后的头
        ListNode pNode = pHead;//当前节点
        ListNode pPrev = null;//当前节点的前一个节点

        while (pNode != null) {
            ListNode pNext = pNode.next;
            if (pNext == null)
                pReverseHead = pNode;
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        return pReverseHead;
    }

}
