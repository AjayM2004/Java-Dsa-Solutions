class Solution {
    static int count(Node head)
    {
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    static Node deleteTail(Node head)
    {
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node prev = temp.prev;
        prev.next = null;
        temp.prev = null;
        return head;
    }
    static Node deleteHead(Node head)
    {
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return head;
    }
    public Node deleteNode(Node head, int x) {
        int cnt = count(head);
        if(cnt<x)
        {
            return head;
        }
        if(cnt == x)
        {
            return deleteTail(head);
        }
        if(x == 1)
        {
            return deleteHead(head);
        }
        int c = 0;
        Node temp = head;
        while(temp!=null)
        {
            c++;
            if(c==x)
            {
                break;
            }
            temp = temp.next;
        }
        Node prev = temp.prev;
        Node front = temp.next;
        prev.next= front;
        front.prev = prev;
        temp.next = null;
        temp.prev = null;
        return head;
    }
}
