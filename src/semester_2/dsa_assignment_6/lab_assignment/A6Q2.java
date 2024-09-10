package semester_2.dsa_assignment_6.lab_assignment;
/*
 * public static Node push(Node top) -  Add an element x to the stack S requires creation of node containing x and putting it in front of the top node pointed by S. 
 * public  static  Node pop(Node top)- Delete the top node from the stack S so that next element becomes the top. 
 * public static void display(Node top)- Display all the elements of Stack S.
 */

import java.util.Scanner;

class Node {
	int info;
	Node next;

	Node(int info) {
		this.info = info;
		this.next = null;
	}
}

class StackOverflowException extends Exception {
	public StackOverflowException (String message) {
		super(message);
	}
}

class StackUnderFlowException extends Exception {
	public StackUnderFlowException(String message) {
		super(message);
	}

}

class EmptyStackException extends Exception {
	public EmptyStackException(String message) {
		super(message);
	}
}

public class A6Q2 {
	static Scanner sc = new Scanner(System.in);

	public static Node push(Node top) throws StackOverflowException  {
		System.err.println("Enter the data for Stack : ");
		int info = sc.nextInt();
		Node newNode = new Node(info);

		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}

		return top;
	}

	public static Node pop(Node top) throws StackUnderFlowException  {
		if (top == null) {
			throw new StackUnderFlowException("Cannot use POP operation: Stack is Empty.");
		} else {
			top = top.next;
		}
		return top;
	}

	public static void peek(Node top) throws EmptyStackException  {
		if (top == null) {
			throw new EmptyStackException("Cannot use PEEK operation: Stack is Empty");
		} else {
			System.out.println("Info :" + top.info);
		}
	}

	public static void Display(Node top) {
		for (Node i = top; i != null; i = i.next) {
			System.out.print(i.info + " -> ");
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		try {
			Node top = null;
			while (true) {
				System.out.println("****MENU****");
				System.out.println("0:Exit");
				System.out.println("1:Push");
				System.out.println("2:Pop");
				System.out.println("3:Peek");
				System.out.println("4:Display");
				System.out.println("Enter your choice");
				int choice = sc.nextInt();
				switch (choice) {
				case 0: {
					System.out.println("Exiting....");
					System.exit(0);
				}
				case 1: {
					top = push(top);
					break;
				}
				case 2: {
					top = pop(top);
					break;
				}
				case 3: {
					peek(top);
					break;
				}
				case 4: {
					Display(top);
					break;
				}
				default:
					System.out.println("Wrong choice");
				}
			}

		} catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}

}
