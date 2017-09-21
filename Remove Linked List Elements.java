/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class Solution {
    /*
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        ListNode check = new ListNode(0);
        check.next = head;
        head = check;
        while (head.next != null){
            if (head.next.val == val){
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return check.next;
    }
}