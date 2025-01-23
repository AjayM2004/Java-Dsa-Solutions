package com.dsa.linkedlist;
class Node{
	int data;
	Node next;
	Node(int data,Node next)
	{
		this.data = data;
		this.next = next;
	}
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class ArrayToLinkedList {
	static Node createLinkedList(int[] nums)
	{
	      Node head = new Node(nums[0]);
	      Node mover = head;
	      for(int i=1;i<nums.length;i++)
	      {
	    	  Node temp = new Node(nums[i]);
	    	  mover.next = temp;
	    	  mover = temp;
	      }
	      return head;
	}
	static boolean searchElement(Node head,int value)
	{
		Node temp = head;
		while(temp!=null)
		{   if(temp.data == value)
		    {
			    return true;
		    }
			temp = temp.next;
		}
		return false;
	}
	static int linkedListLength(Node head)
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			temp = temp.next;
			count++;
		}
		return count;
	}
	static Node removeHead(Node head)
	{   
		if(head==null)
		{
			return head;
		}
		head = head.next;
		return head;
	}
	static Node removeTail(Node head)
	{
		Node temp = head;
		while(temp.next.next!=null)
		{
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}
	static void traverseLinkedList(Node head)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	static Node deleteK(Node head,int k)
	{
		Node temp = head;
		Node prev = null;
		if(head==null)
		{
			return head;
		}
		if(k==1)
		{
			head = head.next;
			return head;
		}
		int count=0;
		while(temp!=null && count<k)
		{
			count++;
			if(count==k)
			{
				prev.next = prev.next.next;
				return head;
			}
			prev = temp;
			temp=temp.next;
		}
		
		System.out.println("You entered very high value");
		return head;
	}
	static Node insertStart(int data,Node head)
	{
		return new Node(data,head);
	}
	static Node insertTail(int data,Node head)
	{
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = new Node(data);
		return head;
	}
	static Node insertK(Node head,int element,int k)
	{   
		Node temp = head;
		if(head==null)
		{
			if(k==1)
			{
				return new Node(element,head);
			}
			else {
				return null;
			}
		}
		if(k==1)
		{
			return new Node(element,temp);
		}
		int cnt=0;
		while(temp!=null)
		{
			cnt++;
			if(cnt==(k-1))
			{
			    Node node = new Node(element,temp.next);   
			    temp.next = node;
			    break;
			}
			temp=temp.next;
		}
		return head;
	}
	static Node insertValueBefore(Node head,int element,int val)
	{   
		Node temp = head;
		if(head==null)
		{
			System.out.println("Value not found");
			return null;
		}
		if(temp.data == val)
		{
			return new Node(element,temp);
		}
		while(temp!=null)
		{
			if(temp.next.data==val)
			{
			    Node node = new Node(element,temp.next);   
			    temp.next = node;
			    break;
			}
			temp=temp.next;
		}
		return head;
	}
    public static void main(String[] args) {
		int[] arr = {100,200,300,400,500,600};
		Node head = createLinkedList(arr);
		int len = linkedListLength(head);
		System.out.println("Length="+len);
		System.out.println(searchElement(head,100));
		System.out.println(searchElement(head,1000));
		System.out.println("Before removing head");
		traverseLinkedList(head);
		head=removeHead(head);
		System.out.println("After removing head");
		traverseLinkedList(head);
		System.out.println("Before removing last element...");
		traverseLinkedList(head);
		head=removeTail(head);
		System.out.println("After removing last element...");
		traverseLinkedList(head);
		head=deleteK(head,1);
		System.out.println("************");
		traverseLinkedList(head);
		head = insertStart(1000,head);
		System.out.println("************");
		traverseLinkedList(head);
		head = insertTail(7000,head);
		System.out.println("************");
		traverseLinkedList(head);
		head = insertK(head,-1000,6);
		System.out.println("************");
		traverseLinkedList(head);
		head = insertValueBefore(head,9000,7000);
		System.out.println("************");
		traverseLinkedList(head);
	}
}
