package com.plus.medium;

import com.plus.common.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers_2 {


    /**
     * 和两个整数的加法类似，依次累加最低位，当前位没有的按0计算，遇到10就取余并进一
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode mid = new ListNode(0);
        ListNode res = mid;
        int sum = 0;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int ge = x + y + sum;
            sum = ge / 10;
            mid.next = new ListNode(ge % 10);
            mid = mid.next;//将mid赋值为它的下一个节点，这样循环中的mid会一直往下链
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (sum > 0) {
            mid.next = new ListNode(sum);
        }
        return res.next;
    }
}
