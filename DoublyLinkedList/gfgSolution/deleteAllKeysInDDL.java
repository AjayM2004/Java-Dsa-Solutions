class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
         Node temp = head;
        while(temp!=null)
        {
            if(temp.data == x)
            {
                if(temp==head)
                {
                    head = temp.next;
                }
                Node prevNode = temp.prev;
                Node nextNode = temp.next;
                if(prevNode!=null)
                {
                    prevNode.next = nextNode;
                }
 
                if(nextNode!=null)
                {
                    nextNode.prev = prevNode;
                }
                temp = nextNode;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}
