public class Solution {
    /*
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if ((l1 == null) && (l2 == null)) {
            return null;
        }
        ListNode newHead = new ListNode(0);
        ListNode index = newHead;
        while ((l1 !=null) && (l2 != null)) {
            if (l1.val < l2.val) {
                index.next = l1;
                l1 = l1.next;
            } else {
                index.next = l2;
                l2 = l2.next;
            }
            index = index.next;
        }
        while (l1 != null) {
            index.next = l1;
            l1 = l1.next;
            index = index.next;
        }
        while (l2 != null) {
            index.next = l2;
            l2 = l2.next;
            index = index.next;
        }
        return newHead.next;
    }
}