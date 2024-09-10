package semester_2.dsa_assignment_6.lab_assignment;

import java.util.Scanner;

/*
 * Array Implementation of Array.
 * public static int push(int S[],int top) – adding an element x to the stack S
 * public static int pop(int S[],int top)– deletes and returns the top element from the stack S
 * public static void display(int S[],int top)- display all the elements of Stack S
 * public static boolean isEmpty(int top) – check if the stack is empty
 * public static boolean isFull(int top) – check if the stack is full when top equals MAX - 1
 */

class StackOverflowError extends Exception {
  StackOverflowError(String message) {
    super(message);
  }
}

class StackUnderFlow extends Exception {
  StackUnderFlow(String message) {
    super(message);
  }
}

public class A6Q1 {

  public static final int MAX = 10;
  static Scanner sc = new Scanner(System.in);

  public static int push(int stack[], int top) throws StackOverflowError {
    System.out.println("Enter the element : ");
    int data = sc.nextInt();

    if ((top + 1) >= MAX) {
      throw new StackOverflowError("Top Greater then MAX");
    } else {
      stack[top + 1] = data;
    }
    return top + 1;
  }

  public static int pop(int stack[], int top) throws StackUnderFlow {
    if ((top - 1) < 0) {
      throw new StackUnderFlow("Top less than 0");
    }
    stack[top] = 0;
    return top - 1;
  }

  public static int peek(int stack[], int top) {
    return stack[top];
  }

  public static void display(int stack[], int top) {
    for (int i = top; i >= 0; i--) {
      System.out.println(stack[i]);
    }
  }

  public static boolean isEmpty(int top) {
    if (top == -1) {
      return true;
    }
    return false;
  }

  public static boolean isFull(int top) {
    if (top == MAX - 1) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int stack[] = new int[MAX];
    int top = -1;
    try {
      while (true) {

        System.out.println("***MENU***");
        System.out.println("0: Exit");
        System.out.println("1: Push");
        System.out.println("2: Pop");
        System.out.println("3: Peek");
        System.out.println("4: Display");
        System.out.println("5: Check if Stack isEmpty");
        System.out.println("6: Check if Stack Fully Filled");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice) {
          case 0: {
            System.out.println("Exiting....");
            System.exit(0);
            break;
          }
          case 1: {
            top = push(stack, top);
            break;
          }
          case 2: {
            top = pop(stack, top);
            break;
          }
          case 3: {
            int peekElement = peek(stack, top);
            System.out.println("Top Element : " + peekElement);
            break;
          }
          case 4: {
            display(stack, top);
            break;
          }
          case 5: {
            if (isEmpty(top) == true) {
              System.out.println("Stack is Empty");
            } else {
              System.out.println("Stack is NOT Empty.");
            }
            break;
          }
          case 6: {
            if (isFull(top) == true) {
              System.out.println("Stack is Fully Filled");
            } else {
              System.out.println("Stack is NOT Fully Filled.");
            }
            break;
          }
          default:
            System.out.println("Invalid choice");
        }
      }

    } catch (Exception e) {
      System.out.println("Exception : " + e);
    }
  }
}
