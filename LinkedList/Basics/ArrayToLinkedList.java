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
    public static void main(String[] args) {
		int[] arr = {100,200,300,400,500,600};
		Node head = createLinkedList(arr);
		Node temp = head;
		System.out.println("Traversing LinkedList");
		System.out.println("**********");
		while(temp != null)
		{
		    System.out.println(temp.data);
		    temp = temp.next;
		}
		System.out.println("**********");
	}
}
