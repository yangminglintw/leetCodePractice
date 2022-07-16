package leetcode;

public class MiddleLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode middle = head;

        int length = 0;

        while (head != null) {
            length++;
            head = head.next;
        }

        for (int i = 0; i < (length/2) + 1; i++) {
            middle = middle.next;
        }

        return middle;
    }

}
