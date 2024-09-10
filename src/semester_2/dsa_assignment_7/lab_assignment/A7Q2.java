package semester_2.dsa_assignment_7.lab_assignment;

import java.util.Scanner;

/*
 * public static Node insert(Node rear, Node front)-adding an element x to the rear end of the queue Q 
 * public static Node delete(Node rear, Node front)-deletes the element from the front of the queue Q 
 * public static void display(Node rear, Node front)-display all the elements of the queue Q.  
 * 
 * 
 * Linked List Implementation of Queue.
 * 
 */

class QNode {
  int info;
  QNode next;

  QNode(int info) {
    this.info = info;
    this.next = null;
  }
}

public class A7Q2 {

  static Scanner sc = new Scanner(System.in);

  public static QNode insert(QNode rear, QNode front) {
    System.out.println("Enter the Info : ");
    int info = sc.nextInt();
    QNode newNode = new QNode(info);

    if (front == null && rear == null) {
      rear = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
    return rear;
  }

  public static QNode delete(QNode rear, QNode front) {
    if (front == null) {
      System.out.println("Cannot Delete the Element : Queue is Empty.");
    } else {
      QNode copy = front;
      front = front.next;
      if (front == null) {
        rear = null;
      }
      copy.next = null;
    }

    return front;
  }

  public static void display(QNode rear, QNode front) {
    if (front == null) {
      System.out.println("Queue is empty.");
      return;
    }

    QNode current = front;
    while (current != null) {
      System.out.print(current.info + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    QNode front = null;
    QNode rear = null;

    while (true) {

      System.out.println("***MENU***");
      System.out.println("0: Exit");
      System.out.println("1: Insert");
      System.out.println("2: Delete");
      System.out.println("3: Display");
      System.out.println("Enter your choice");
      int choice = sc.nextInt();
      switch (choice) {
        case 0:
          System.exit(0);
        case 1:
          rear = insert(rear, front);
          if (front == null) {
            front = rear;
          }
          break;
        case 2:
          front = delete(rear, front);
          break;
        case 3:
          display(rear, front);
          break;
        default:
          System.out.println("Wrong Choise.");
      }
    }
  }
}
