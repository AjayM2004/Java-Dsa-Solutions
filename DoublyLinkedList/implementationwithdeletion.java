package com.dsa.linkedlist2d;
class Node{
	int data;
	Node next;
	Node back;
	Node(int data,Node next,Node back)
	{
		this.data = data;
		this.next = next;
		this.back = back;
	}
	Node(int data)
	{
		this.data = data;
		this.next = null;
		this.back = null;
	}
}
public class DoublyLinkedlist {
	    static Node createLinkedList(int[] arr)
	    {
	    	Node head = new Node(arr[0]);
	    	Node prev = head;
	    	for(int i=1;i<arr.length;i++)
	    	{
	    		Node temp = new Node(arr[i],null,prev);
	    		prev.next = temp;
	    		prev = temp;
	    	}
	    	return head;
	    }
	    static void print(Node head,String message)
	    {
	    	System.out.println("DoublyLinkedList "+message);
	    	 while(head!=null)
	    	 {
	    		 System.out.print(head.data+"<->");
	    		 head = head.next;
	    	 }
	    	 System.out.println("null");
	    }
	    static Node deleteHead(Node head)
	    {
	    	if(head==null || head.next==null)
	    	{
	    		return null;
	    	}
	    	Node prev = head;
	    	head = head.next;
	    	head.back = null;
	    	prev.next = null;
	    	return head;
	    }
	    static Node deleteTail(Node head)
	    {
	    	if(head==null || head.next==null)
	    	{
	    		return null;
	    	}
	    	Node tail = head;
	    	while(tail.next!=null)
	    	{
	    		tail = tail.next;
	    	}
	    	Node prev = tail.back;
	    	prev.next = null;
	    	tail.back = null;
	    	return head;
	    }
	    static int count(Node head)
	    {
	    	Node temp  = head;
	    	int c = 0;
	    	while(temp!=null)
	    	{
	    		c++;
	    		temp = temp.next;
	    	}
	    	return c;
	    }
	    static Node removeKthElement(Node head,int k)
	    {
	    	Node temp = head;
	    	int count = 0;
	    	while(temp!=null)
	    	{
	    		count++;
	    		if(count==k)
	    		{
	    			break;
	    		}
	    		temp = temp.next;
	    	}
	    	Node prev = temp.back;
	    	Node front = temp.next;
	    	if(prev==null && front==null)
	    	{
	    		return null;//for single element in the linked list
	    	}
	    	else if(prev==null)
	    	{
	    		head = deleteHead(head);
	    		return head;//deleting element at the head
	    	}
	    	else if(front==null)
	    	{
	    		head = deleteTail(head);
	    		return head;
	    	}
	    	prev.next = front;
	    	front.back = prev;
	    	temp.next = null;
	    	temp.back =null;
	    	return head;
	    }
	    static Node insertionAtBeginning(Node head,int val)
	    {
	    	Node newnode = new Node(val);
	    	if(head==null)
	    	{
	    		return newnode;
	    	}
	    	head.back = newnode;
	    	newnode.next = head;
	    	head = newnode;
	    	return head;
	    }
	    static Node insertionBeforeEnd(Node head,int val)
	    {
	    	if(head.next==null)
	    	{
	    		return insertionAtBeginning(head,val);
	    	}
	    	Node tail = head;
	    	while(tail.next!=null)
	    	{
	    		tail = tail.next;
	    	}
	    	Node prev = tail.back;
	        Node newnode = new Node(val,tail,prev);
	        prev.next = newnode;
	        tail.back = newnode;
	        return head;
	    }
	    static Node insertionBeforeKthNode(Node head,int val,int k)
	    {
	    	if(k==1)
	    	{
	    		return insertionAtBeginning(head,val);
	    	}
	    	if(k==count(head))
	    	{
	    		return insertionBeforeEnd(head,val);
	    	}
	    	int cnt= 0;
	    	Node temp = head;
	    	while(temp!=null)
	    	{
	    		cnt++;
	    		if(cnt==k)
	    		{
	    			break;
	    		}
	    		temp = temp.next;
	    	}
	    	Node prev = temp.back;
	        Node newnode = new Node(val,temp,prev);
	        prev.next = newnode;
	        temp.back = newnode;
	        return head;
	    }
        public static void main(String[] args) {
			int[] arr = {11,12,13,14,15,100,200};
			Node head = createLinkedList(arr);
			print(head,"Before deletion of head..");
			head = deleteHead(head);
			print(head,"After deletion of head..");
			head = deleteTail(head);
			print(head,"After deletion of tail...");
			System.out.println("Length of the linked list=>"+count(head));
			head = removeKthElement(head,3);
			print(head,"After deletion of kth element");
			head = insertionAtBeginning(head,5);
			print(head,"After insertion at the beginning");
			head = insertionBeforeEnd(head,10000);
			print(head,"After insertion before the end");
			head = insertionBeforeKthNode(head,-100,3);
			print(head,"After insertion before the k");
		}
}

