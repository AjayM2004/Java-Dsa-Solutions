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
		
	}
}
