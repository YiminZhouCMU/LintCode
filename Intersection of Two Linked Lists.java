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
        while ((pa.next != null) && (pb.next != null)) {
            pa = pa.next;
            pb = pb.next;
        }
        if ((pa.next == null) && (pb.next == null)) {
            if (pa != pb){
                return null;
            }
        }
        if (pa.next == null) {
            ListNode taila = pa;
            pa = headB;
            if (pb.next != null) {
                pb = pb.next;
            } else {
                ListNode tailb = pb;
                if (taila != tailb) {
                    return null;
                }
                pb = headA;
            }
            while (pa.next != null) {
                if (pa == pb) {
                    break;
                }
                pa = pa.next;
                if (pb.next != null) {
                    pb = pb.next;
                } else {
                    ListNode tailb = pb;
                    if (taila != tailb) {
                        return null;
                    }
                    pb = headA;
                }
            }
            result = pa;
        }
        if (pb.next == null) {
            ListNode tailb = pb;
            pb = headA;
            if (pa.next != null) {
                pa = pa.next;
            } else {
                ListNode taila = pa;
                if (taila != tailb) {
                    return null;
                }
                pa = headB;
            }
            while (pb.next != null) {
                if (pa == pb) {
                    break;
                }
                pb = pb.next;
                if (pa.next != null) {
                    pa = pa.next;
                } else {
                    ListNode taila = pa;
                    if (taila != tailb) {
                        return null;
                    }
                    pa = headB;
                }
            }
            result = pb;
        }
        return result;
        
    }
}