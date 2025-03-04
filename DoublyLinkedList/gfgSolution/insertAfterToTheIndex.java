class Solution {
    // Function to insert a new node at given position in doubly linked list.
    static Node insertAtEnd(Node head,int x)
    {
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node newNode = new Node(x);
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    static int count(Node head)
    {
        Node temp = head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    Node addNode(Node head, int p, int x) {
        int cnt = count(head);
        if(cnt-1 == p)
        {
            return insertAtEnd(head,x);
        }
        if(head==null)
        {
            return head;
        }
        Node temp = head;
        int count = -1;
        while(temp.next!=null)
        {
            count++;
            if(count==p)
            {
                break;
            }
            temp = temp.next;
        }
        Node front = temp.next;
        Node newnode = new Node(x);
        front.prev = newnode;
        temp.next = newnode;
        newnode.next = front;
        newnode.prev = temp;
        return head;
    }
}
