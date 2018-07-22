package me.fanbin.leetcode.s0021;

/**
 * 21. Merge Two Sorted Lists
 * @author fanbin
 * @date 2018/7/22
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode temp;
        if (l1.val > l2.val) {
            temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode current = l1;
        while (true) {
            if (l2 == null) {
                break;
            }
            if (current.next == null) {
                current.next = l2;
                break;
            }
            if (current.next.val <= l2.val) {
                current = current.next;
                continue;
            } else {
                temp = current.next;
                current.next = l2;
                l2 = l2.next;
                current = current.next;
                current.next = temp;
            }
        }
        return l1;
    }

}
