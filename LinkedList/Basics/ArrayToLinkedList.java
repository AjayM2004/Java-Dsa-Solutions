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
    public static void main(String[] args) {
		int[] arr = {100,200,300,400,500,600};
		Node head = createLinkedList(arr);
		Node temp = head;
		System.out.println("**********");
        System.out.println("----Traversing the linkedList elements----");
		while(temp != null)
		{
		    System.out.println(temp.data);
		    temp = temp.next;
		}
		System.out.println("***********");
		int len = linkedListLength(head);
		System.out.println("Length="+len);
	}
}
