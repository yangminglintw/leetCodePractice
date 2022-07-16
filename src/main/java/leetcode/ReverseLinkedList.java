package leetcode;

public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {

        ListNode node = null;

        while (head != null) {
            ListNode next = head.next;

            head.next = node;
            node = head;

            head = next;
        }

        return node;
    }
}
