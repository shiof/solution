package com.shiof.solution._20190522;

import com.shiof.solution.common.ListNode;

/**
 * <a href="https://leetcode-cn.com/problems/merge-two-sorted-lists/">21. 合并两个有序链表</a>
 * <p>
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * <p>
 * 输出：1->1->2->3->4->4
 *
 * @author spwang on 2019/5/22 9:23
 * @version 1.0.0
 * @since 1.0.0
 */
public class MergeTwoLists {

    public ListNode solution(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = solution(l1.next, l2);
            return l1;
        } else {
            l2.next = solution(l1, l2.next);
            return l2;
        }
    }

    public ListNode solution2(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode header = new ListNode(0);

        ListNode nextNode = header;
        while (l1 != null && l2 != null) {
            nextNode.next = nextNode = new ListNode(Math.min(l1.val, l2.val));
            if (l1.val <= l2.val) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }
        }
        if (null == l1) {
            nextNode.next = l2;
        }
        if (null == l2) {
            nextNode.next = l1;
        }
        return header.next;
    }
}
