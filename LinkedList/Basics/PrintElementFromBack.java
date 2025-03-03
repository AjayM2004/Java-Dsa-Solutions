class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
      if(head==null)
      {
          return -1;
      }
      Node temp = head;
      int count = 0;
      while(temp!=null)
      {
          count++;
          temp = temp.next;
      }
      if(count==k)
      {
          temp = head;
          return temp.data;
      }
      if(k>count)
      {
          return -1;
      }
      int n = count-k;
      temp = head;
      while(temp!=null)
      {
         n--;
         if(n==0)
         {
             break;
         }
         temp = temp.next;
      }
      temp = temp.next;
      return temp.data;
    }
}
