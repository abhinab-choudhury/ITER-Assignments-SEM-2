package semester_2.dsa_assignment_7.lab_assignment;

import java.util.Scanner;

/*
 * public static void insert(int Q[])-adding an element x to the rear end of the queue Q 
 * public static void delete(int Q[])-deletes the element from the front of the queue Q 
 * public static void display(int Q[])-display all the elements of the queue Q.  
 * public static boolean is_full()-check if the queue  is full  or not.  
 * public static boolean is_empty()-check if the queue is empty or not
 *
 * 
 * 
 * Array Implementation of the Array.
 */

class QueueOverFlowException extends Exception {
  QueueOverFlowException(String message) {
    super(message);
  }
}

class QueueUnderFlowException extends Exception {
  QueueUnderFlowException(String message) {
    super(message);
  }
}

public class A7Q1 {

  public static final int MAX = 5;
  public static int front = -1;
  public static int rear = -1;
  static Scanner sc = new Scanner(System.in);

  public static void insert(int Q[]) throws QueueOverFlowException {
    if (is_full()) {
      throw new QueueOverFlowException("Queue OverFlow");
    }
    if (rear == -1) {
      front++;
    } 
    rear++;
  
    System.out.println("Enter the Info : ");
    Q[rear] = sc.nextInt();
  }

  public static void delete(int Q[]) throws QueueUnderFlowException {
    if (is_empty()) {
      throw new QueueUnderFlowException("Queue UnderFlow");
    } else {
      if (front == rear) {
        front = rear = -1;
      } else {
        front++;
      }
    }
  }

  public static void display(int Q[]) {
    System.out.print("Front -> ");
    for (int i = front; i <= rear; i++) {
      System.out.print(Q[i] + " ");
    }
    System.out.println("-> Rear");
  }

  public static boolean is_full() {
    if (rear == MAX - 1) {
      return true;
    }
    return false;
  }

  public static boolean is_empty() {
    if (front == -1) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    try {
      int queue[] = new int[MAX];

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
            insert(queue);
            break;
          case 2:
            delete(queue);
            break;
          case 3:
            display(queue);
            break;
          default:
            System.out.println("Wrong Choise.");
        }
      }
    } catch (Exception e) {
      System.out.println("Error : " + e);
    }
  }
}
