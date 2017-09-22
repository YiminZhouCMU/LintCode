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
        // write your code here
        long num1 = 0;
        long num2 = 0;
        long factor = 1;
        ListNode bit = new ListNode(0);
        bit = l1;
        while (bit != null) {
            num1 = bit.val * factor + num1;
            bit = bit.next;
            factor = factor * 10;
        }
        bit = l2;
        factor = 1;
        while (bit != null) {
            num2 = bit.val * factor + num2;
            bit = bit.next;
            factor = factor * 10;
        }
        long sum = num1 + num2;
        ListNode head = new ListNode((int) (sum % 10));
        ListNode tail = new ListNode((int) (sum % 10));
        head = tail;
        sum = sum / 10;
        for (; sum > 0; sum = sum / 10) {
            ListNode result = new ListNode((int) (sum % 10));
            tail.next = result;
            tail = tail.next;
        }
        return head;
    }
}