/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        // ListNode odd = head;
        // ListNode even = head.next;
        // ListNode safe = head.next;
        // while(even!=null && even.next!=null)
        // {
        //     odd.next = odd.next.next;
        //     even.next = even.next.next;
        //     odd = odd.next;
        //     even = even.next;
        // }
        // odd.next = safe;
        // return head;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode odd = head;
        while(odd!=null && odd.next!=null)
        {
            list.add(odd.val);
            odd = odd.next.next;
        }
        if(odd!=null)
        {
            list.add(odd.val);
        }
        ListNode even = head.next;
        while(even!=null && even.next!=null)
        {
            list.add(even.val);
            even = even.next.next;
        }
        if(even!=null)
        {
            list.add(even.val);
        }
        ListNode temp=head;
        int i=0;
        while(temp!=null)
        {
            temp.val = list.get(i++);
            temp = temp.next;
        }
        return head;
    }
}
