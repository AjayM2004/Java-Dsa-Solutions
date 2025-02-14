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
    static int count(ListNode head)
    {
        ListNode temp = head;
        int c=0;
        while(temp!=null)
        {
           c++;
           temp = temp.next;
        }
        return c;
    }
    public ListNode rotateRight(ListNode head, int k) {
          int n = count(head);
          if(k==0 || n==0)
          {
            return head;
          }
          k = k%n;
          if(k==0)
          {
            return head;
          }
          ListNode temp = head;
          while(temp.next!=null)
          {
            temp = temp.next;
          }
          temp.next = head;
          int l = n - k;
          temp = head;
          int c = 0;
          while(temp!=null)
          {
             c++;
             if(c==l)
             {
                break;
             }
             temp = temp.next;
          }
          head = temp.next;
          temp.next = null;
          return head;
    }
}
