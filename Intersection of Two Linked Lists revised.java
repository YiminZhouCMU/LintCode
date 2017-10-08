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
    /*
     * @param headA: the first list
     * @param headB: the second list
     * @return: a ListNode
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if ((headA == null) || (headB == null)) {
            return null;
        }
        
        ListNode pa = headA;
        ListNode pb = headB;
        ListNode result = new ListNode(0);
        int counta = 0;
        int countb = 0;
        
        while (pa != pb) {
            if (pa.next != null) {
                pa = pa.next;
            } else {
                if (counta > 1) {
                    return null;
                }
                pa = headB;
                counta++;
            }
            if (pb.next != null) {
                pb = pb.next;
            } else {
                if (countb > 1) {
                    return null;
                }
                pb = headA;
                countb++;
            }
        }
        
        result = pa;
        return result;
    }
}