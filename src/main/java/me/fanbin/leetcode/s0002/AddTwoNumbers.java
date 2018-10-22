package me.fanbin.leetcode.s0002;

/**
 * 2. Add Two Numbers
 *
 * @author fanbin
 * @date 2018/10/22
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curr = result;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int carry = 0;
        while (curr1 != null || curr2 != null) {
            int value1 = curr1 == null ? 0 : curr1.val;
            int value2 = curr2 == null ? 0 : curr2.val;
            int sum = value1 + value2 + carry;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum / 10;
            if (curr1 != null) {
                curr1 = curr1.next;
            }
            if (curr2 != null) {
                curr2 = curr2.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return result.next;

    }

}
