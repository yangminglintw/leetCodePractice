package leetcode;

public class MergeTwoSortedLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode merge = new ListNode(0);
        ListNode current = merge;

        while (list1 != null && list2 != null) {
            if ( list1 != null && list1.val < list2.val) {
                merge.next = list1;
                list1 = list1.next;
            } else {
                merge.next = list2;
                list2 = list2.next;
            }

            merge = merge.next;
        }

        if (list1 != null) {
            merge.next = list1;
        }

        if (list2 != null) {
            merge.next = list2;
        }

        return current.next;
    }
}
