package chapter2;

import java.util.*;

/*
 * Time Complexity is O(n)
 * */

import chapter2.removeDuplicates.Node;

public class lastElement {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void printlist(Node node) {
		while (node != null) {
			System.out.print(" " + node.data + " ");

			node = node.next;
		}
	}

// Approach One
	void printlastElement(int n) {

		int length = 0;
		Node temp = head;

		while (temp != null) {
			temp = temp.next;
			length++; // Increase the counter to get the number of nodes in a list
		}

		if (length < n) { // to check the whether the value of n is not more than the length of the list
			return;
		}

		temp = head;
		for (int i = 1; i < length - n + 1; i++) {
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	// Approach two using recursive function
	
	public static void main(String[] args) {
		// Find the Kth element in the linkedlist

		lastElement list = new lastElement();

		list.head = new Node(10);
		list.head.next = new Node(12);
		list.head.next.next = new Node(11);
		list.head.next.next.next = new Node(11);
		list.head.next.next.next.next = new Node(12);
		list.head.next.next.next.next.next = new Node(11);
		list.head.next.next.next.next.next.next = new Node(10);

		// Print the list
		System.out.println("Linked List : \n");

		list.printlist(head);

		System.out.println("\n\nKth element from the last of the list is : \n");
		list.printlastElement(3);
	}
}