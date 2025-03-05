
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) 
    {
        int count0=0;
        int count1=0;
        int count2=0;
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==0)
            {
                count0++;
            }
            else if(temp.data==1)
            {
                count1++;
            }
            else{
                count2++;
            }
            temp = temp.next;
        }
        temp = head;
        for(int i=1;i<=count0;i++)
        {
            temp.data = 0;
            temp = temp.next;
        }
        for(int i=1;i<=count1;i++)
        {
            temp.data = 1;
            temp = temp.next;
        }
        for(int i=1;i<=count2;i++)
        {
            temp.data = 2;
            temp = temp.next;
        }
        return head;
    }
}
