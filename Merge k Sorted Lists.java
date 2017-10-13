/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {  
        if ((lists == null) || (lists.size() == 0)) {
            return null;
        }
        while (lists.size() > 1) {
            List<ListNode> new_lists = new ArrayList<ListNode>();
            for (int i = 0; i < (lists.size() - 1); i = i + 2) {
                ListNode merge = mergeHelper(lists.get(i), lists.get(i + 1));
                new_lists.add(merge);
            }
            if (lists.size() % 2 == 1) {
                new_lists.add(lists.get(lists.size() - 1));
            }
            lists = new_lists;
        }
        return lists.get(0);
    }
    private ListNode mergeHelper(ListNode l1, ListNode l2) {
        // if ((l1 == null) && (l2 == null)) {
        //     return null;
        // }
        ListNode head = new ListNode(0);
        ListNode index = head;
        while ((l1 != null) && (l2 != null)) {
            if (l1.val < l2.val) {
                index.next = l1;
                l1 = l1.next;
            } else {
                index.next = l2;
                l2 = l2.next;
            }
            index = index.next;
        }
        if (l1 != null) {
            index.next = l1;
        }
        if (l2 != null) {
            index.next = l2;
        }
        return head.next;
    }
}
