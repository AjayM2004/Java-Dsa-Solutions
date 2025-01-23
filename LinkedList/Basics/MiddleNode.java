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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count=0;
        if(temp==null)
        {
            return head;
        }
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        temp = head;
        int mini = (count/2)+1;
        while(temp!=null)
        {
            mini-=1;
            if(mini==0)
            {
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
}
