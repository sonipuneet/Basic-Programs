package chapter2;

import chapter2.lastElement.Node;

public class DeleteMiddleNode {
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

	static Node deleteNode(Node head) {
		// Base cases
		if (head == null) {
			System.out.println("Empty List");
		}

		if (head.next == null) {
			System.out.println("Only one element exist in the list");
		}

		// Two pointer to reach the middle of the list.
		Node slow_ptr = head;
		Node fast_ptr = head;

		Node prev = null;

		while (fast_ptr != null && fast_ptr.next != null) {
			fast_ptr = fast_ptr.next.next;
			prev = slow_ptr;
			slow_ptr = slow_ptr.next;
		}
		prev.next = slow_ptr.next;
		
		return head;
	}

	public static void main(String[] args) {
		//

		DeleteMiddleNode list = new DeleteMiddleNode();

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

		head = deleteNode(head);
		//System.out.println("\n\nThe deleted node is" + head);
		System.out.println("\n\n List after deletion:");
		list.printlist(head);
	}
}