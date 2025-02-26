class Solution {
    // Function to find the length of a loop in the linked list.
    static int findLength(Node slow,Node fast)
    {
        fast = fast.next;
        int c = 1;
        while(true)
        {
            fast = fast.next;
            c++;
            if(slow==fast)
            {
                return c;
            }
        }
        
    }
    public int countNodesinLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                return findLength(slow,fast);
            }
        }
        return 0;
    }
}
