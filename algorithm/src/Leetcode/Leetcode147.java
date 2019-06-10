package Leetcode;

class Node {
	public Node next;
	public int data;

	public Node() {
	}

	public Node(Node next, int data) {
		this.next = next;
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node p = this;
		while(p!=null) {
			sb.append(p.data+"->");
			p=p.next;
		}
		String string = sb.toString();
		return string.substring(0,string.length()-2);
	}
	
}

public class Leetcode147 {
	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test2() {
		Node head = new Node(new Node(new Node(new Node(null, 3), 1), 2), 4);
		Node sorted = sort(head);
		System.out.println(sorted);
	}

	private static void test1() {
		Node head = new Node(new Node(new Node(new Node(new Node(null,0), 4), 3), 5), -1);
		Node sorted = sort(head);
		System.out.println(sorted);
	}

	private static Node sort(Node head) {
		Node sortedL, sortedR;
		sortedL = head;
		sortedR = head;
		Node current = head;
		while (sortedR.next != null) {
			current = sortedR.next;
			if (current.data < sortedL.data) {
				sortedR.next = current.next;
				current.next = sortedL;
				sortedL = current;
			} else if (sortedL.data <= current.data && current.data < sortedR.data) {
				Node p = sortedL;
				while (p != sortedR) {
					if (p.data <= current.data && current.data < p.next.data) {
						sortedR.next = current.next;
						current.next = p.next;
						p.next = current;
						break;
					}
					p = p.next;
				}
			} else {
				sortedR = current;
			}
			
		}
		return sortedL;
	}
}
