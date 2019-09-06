/**
* CS 111 Section No. 002 
* Lab Assignment 9 
* @author Samuel Harris
**/

public class Unordered<T> {
	private static class Node<T> {
		private T data;
		private Node<T> next;

		private Node(T d) {
			data = d;
			next = null;
		}

		private Node(T d, Node<T> ref) {
			data = d;
			next = ref;
		}
	}

	private Node<T> head;
	private int numEle;

	// Default Constructor
	public Unordered() {
		head = null;
		numEle = 0;
	}

	public void add(T value) {
		Node<T> tempNode = new Node<T>(value);
		if (numEle == 0) {
			head = tempNode;
		} else {
			Node ptr = null;
			ptr = head;
			head = tempNode; // Head points to new value.
			head.next = ptr;
		}
		numEle++;
	}

	public void remove(T value) {
		Node<T> temp = head;
		Node<T> ptr = null;
		while (temp != null) {
			if(value.equals(temp.data)) {
				if (ptr == null) {
					head = temp.next;
					numEle--;
				} else {
					ptr.next = temp.next;
					numEle--;
				}
			}
		ptr = temp;	
		temp = temp.next;
		}
	}

	public void displayForward() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public int size() {
		return numEle;
	}
}
