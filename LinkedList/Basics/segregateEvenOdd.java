public class Solution {
    public static Node segregateEvenOdd(Node head) {
        Node evenDummy = new Node(-1), oddDummy = new Node(-1);
        Node evenTail = evenDummy, oddTail = oddDummy;

        while (head != null) {
            if (head.data % 2 == 0) {
                evenTail.next = new Node(head.data);
                evenTail = evenTail.next;
            } else {
                oddTail.next = new Node(head.data);
                oddTail = oddTail.next;
            }
            head = head.next;
        }

        evenTail.next = oddDummy.next;  // Attach odd list at the end of even list
        return evenDummy.next;          // Skip dummy and return head
    }
}
```
