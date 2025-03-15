class Solution {
    public Node rotate(Node head, int k) {
          if(head==null || head.next == null)
          {
              return head;
          }
          Node temp = head;
          int c = 1;
          while(temp.next!=null)
          {
              c++;
              temp = temp.next;
          }
          k = k % c;
          if(k==0)
          {
              return head;
          }
           temp.next = head;
        //   temp.next = null;
          int count = 0;
          temp = head;
          while(temp!=null)
          {
              count++;
              if(count==k)
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
