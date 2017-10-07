/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if ((l1 == null) && (l2 == null)) {
            return null;
        }
        int carrier = 0;
        ListNode head = new ListNode(0);
        ListNode index = head;
        while ((l1 != null) && (l2 != null)) {
            int sum = l1.val + l2.val + carrier;
            if (sum > 9) {
                carrier = 1;
                sum = sum % 10;
            } else {
                carrier = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            ListNode digit = new ListNode(sum);
            index.next = digit;
            index = index.next;
        }
        while (l1 != null) {
            int sum1 = l1.val + carrier;
            if (sum1 > 9) {
                carrier = 1;
                sum1 = sum1 % 10;
            } else {
                carrier = 0;
            }
            l1 = l1.next;
            ListNode digit1 = new ListNode(sum1);
            index.next = digit1;
            index = index.next;
        }
        while (l2 != null) {
            int sum2 = l2.val + carrier;
            if (sum2 > 9) {
                carrier = 1;
                sum2 = sum2 % 10;
            } else {
                carrier = 0;
            }
            l2 = l2.next;
            ListNode digit2 = new ListNode(sum2);
            index.next = digit2;
            index = index.next;
        }
        if (carrier != 0) {
            ListNode c = new ListNode(carrier);
            index.next = c;
            index = index.next;
        }
        index.next = null;
        return head.next;
    }
}