package chapter2;

import chapter2.DeleteMiddleNode.Node;
import java.util.*;

public class TestList {

	static Node head;

	static class Node {
		int data;
		Node next;

		// Created a linkedlist
		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void insertAtStart(int new_data) { // Time complexity is O(1)
		if (head == null) {
			System.out.println("List is empty");
		}
		// Allocated the node with the data
		Node new_node = new Node(new_data);

		new_node.next = head; // Add the address of previous node into the new_node

		// Point the head node to the new_node

		head = new_node;
	}

	public void insertAtPosition(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("Previous node cannot be null");
		}

		Node new_node = new Node(new_data);

		new_node.next = prev_node.next;

		prev_node.next = new_node;
	}

	public void nodeAppend(int new_data) {

		Node new_node = new Node(new_data);

		if (head == null) {
			head = new Node(new_data);
			return;
		}

		new_node.next = null;

		Node last = head;
		while (last != null) {
			last = last.next;
			last.next = new_node;
			return;
		}
	}

	public void deleteNode(int position) {
		if (head == null) {
			return;
		}

		Node temp = head;

		if (position == 0) {
			head = temp.next;
			return;
		}

		for (int i = 0; temp != null && i < position - 1; i++) {
			temp = temp.next;
		}
		if (temp == null && temp.next == null) {
			return;
		}

		Node next = temp.next.next;
		temp.next = next;

	}

	public void print_list(Node node) {
		while (node != null) {
			System.out.print(" " + node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {

		TestList list = new TestList();

		list.head = new Node(10);
		list.head.next = new Node(12);
		list.head.next.next = new Node(11);
		list.head.next.next.next = new Node(11);
		list.head.next.next.next.next = new Node(12);
		list.head.next.next.next.next.next = new Node(11);
		list.head.next.next.next.next.next.next = new Node(10);

		System.out.println("The Linked list before insertion is :");
		list.print_list(head);

		// Inserting at starting;
		/*
		 * list.insertAtStart(4);
		 * System.out.println("\n\nThe Linked list After insertion at start is :");
		 * list.print_list(head);
		 * 
		 * list.insertAtPosition(list.head, 9);
		 * System.out.println("\n\nThe Linked list After insertion at a position is :");
		 * list.print_list(head);
		 * 
		 * list.nodeAppend(9);
		 * System.out.println("\n\nThe Linked list After insertion at end is :");
		 * list.print_list(head);
		 */
		list.deleteNode(5);
		System.out.println("\n\nThe Linked list After deletion at position is :");
		list.print_list(head);

	}

}
