package com.shiof.solution.common;

/**
 * 简单链表
 *
 * @author spwang on 2019/5/22 9:20
 * @version 1.0.0
 * @since 1.0.0
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int[] arr) {
        this.val = arr[0];
        ListNode next = this;
        for (int i = 1; i < arr.length; i++) {
            next = next.next = new ListNode(arr[i]);
        }
    }
}
