package semester_2.dsa_assignment_5.lab_assignment;

import java.util.Scanner;

class Node {
  protected long reg_no;
  protected float mark;
  protected Node next, prev;

  Node(long reg_no, float mark) {
    this.reg_no = reg_no;
    this.mark = mark;
    this.next = null;
    this.prev = null;
  }
}

class ElementNotFound extends Exception {
  ElementNotFound(String message) {
    super(message);
  }
}

class EmptyLinkedListException extends Exception {
  public EmptyLinkedListException(String message) {
    super(message);
  }
}

class LinkedOutOfBoundException extends Exception {
  public LinkedOutOfBoundException(String message) {
    super(message);
  }
}

public class A5Q1 {

  public static Node InsBeg(Node start, Scanner sc) {
    long reg_no;
    float mark;

    System.out.print("Enter your Regestration.No : ");
    reg_no = sc.nextLong();
    System.out.print("Enter your Marks : ");
    mark = sc.nextFloat();
    Node newNode = new Node(reg_no, mark);

    // if Double Linked List is not Empty then.
    if (start != null) {
      newNode.next = start;
      newNode.prev = null;
      start.prev = newNode;
    }

    start = newNode;

    return start;
  }

  public static Node InsAny(Node start, Scanner sc) throws EmptyLinkedListException, LinkedOutOfBoundException {
    System.out.println("Enter the position : ");
    int idx = sc.nextInt();

    int cnt = 0;
    if (start == null) {
      throw new EmptyLinkedListException("Linked List is Empty.");
    }
    if (idx < count(start) && idx >= 0) {
      int ch = 0;
      long reg_no;
      float mark;
      Node temp = start;

      for (Node i = start; i != null; i = i.next) {
        cnt++;
        temp = temp.next;
        if (cnt == idx) {
          break;
        }
      }

      System.out.print("Enter your Regestration.No : ");
      reg_no = sc.nextLong();
      System.out.print("Enter your Marks : ");
      mark = sc.nextFloat();
      Node newNode = new Node(reg_no, mark);

      while (ch != 3) {
        System.out.println("1. Insert at Front of " + idx + " Index.");
        System.out.println("2. Insert at Back of " + idx + " Index.");
        System.out.println("3. Exit");
        ch = sc.nextInt();

        if (ch == 1) {
          newNode.next = temp.next;
          newNode.prev = temp;
          temp.next = newNode;
          break;
        } else if (ch == 2) {
          newNode.next = temp;
          newNode.prev = temp.prev;
          temp.prev = newNode;
          break;
        } else if (ch == 3) {
          break;
        } else {
          System.out.println("Wrong Choise.....");
          continue;
        }
      }
    } else {
      throw new LinkedOutOfBoundException("Index Out of Bound");
    }

    return start;
  }

  public static Node InsEnd(Node start, Scanner sc) {
    long reg_no;
    float mark;
    Node temp = start;

    if (start == null) {
      return InsBeg(start, sc);
    }

    while (temp.next != null) {
      temp = temp.next;
    }

    System.out.print("Enter your Regestration.No : ");
    reg_no = sc.nextLong();
    System.out.print("Enter your Marks : ");
    mark = sc.nextFloat();
    Node newNode = new Node(reg_no, mark);
    newNode.next = null;
    newNode.prev = temp;
    temp.next = newNode;

    return start;
  }

  public static Node DelBeg(Node start) throws EmptyLinkedListException {
    if (start == null) {
      throw new EmptyLinkedListException("Double Linked List is Empty.");
    }
    Node copy = start;
    start = start.next;
    start.prev = null;
    copy.next = null;

    return start;
  }

  public static Node DelEnd(Node start) throws EmptyLinkedListException {
    if (start == null) {
      throw new EmptyLinkedListException("Double List is Empty.");
    }

    Node temp = start;
    while (temp.next != null) {
      temp = temp.next;
    }

    temp.next = null;

    return start;
  }

  public static Node DelAny(Node start, Scanner sc) throws LinkedOutOfBoundException {
    System.out.println("Enter the Position of the Node in DLL[0," + (count(start) - 1) + "] : ");
    int idx = sc.nextInt();
    if (!(idx < 0) && !(idx > (count(start) - 1))) {
      int i = 0;
      Node j = null;
      for (j = start; j != null; j = j.next, i++) {
        if (i == idx) {
          break;
        }
      }
      j.prev.next = j.next;
      j.next.prev = j.prev;
      j = null;

    } else {
      throw new LinkedOutOfBoundException("Index Out of Bound.");
    }
    return start;
  }

  public static int count(Node start) {
    int cnt = 0;
    for (Node i = start; i != null; i = i.next) {
      cnt++;
    }
    return cnt;
  }

  public static void sort(Node start, Scanner sc) {
    System.out.println("Sorting on Basic of Regstration No. : ");
    System.out.println("1.Sort According to Regstration Number.\n2.Sort According to Marks.");
    int ch = sc.nextInt();

    for (Node i = start; i.next != null; i = i.next) {
      for (Node j = i.next; j != null; j = j.next) {
        if (ch == 1) {
          if (i.reg_no > j.reg_no) {
            long temp = i.reg_no;
            i.reg_no = j.reg_no;
            j.reg_no = temp;

            float temp1 = i.mark;
            i.mark = j.mark;
            j.mark = temp1;
          }
        } else if (ch == 2) {
          if (i.mark > j.mark) {
            long temp = i.reg_no;
            i.reg_no = j.reg_no;
            j.reg_no = temp;

            float temp1 = i.mark;
            i.mark = j.mark;
            j.mark = temp1;
          }
        } else {
          System.out.println("Wrong Choise.");
          System.exit(0);
        }
      }
    }
  }

  public static Node reverse(Node start) {
    Node temp = null;
    Node current = start;
    while (current != null) {
      temp = current.prev;
      current.prev = current.next;
      current.next = temp;

      current = current.prev;
    }

    if (temp != null) {
      start = temp.prev;
    }

    return start;
  }

  public static void search(Node start, Scanner sc) throws ElementNotFound, EmptyLinkedListException {
    System.out.println("Enter the Regstation Number : ");
    long k = sc.nextInt();

    Node index = start;
    if (start == null) {
      throw new EmptyLinkedListException("Linked list is Empty.");
    }
    while (index != null) {
      if (index.reg_no == k) {
        System.out.println("Element Found: Yes");
        System.out.println("Enter the Updated Marks : ");
        index.mark = sc.nextFloat();
        System.out.println("Regstation Number : " + index.reg_no);
        System.out.println("New Marks : " + index.mark);

        return;
      }
      index = index.next;
    }
    throw new ElementNotFound("Element Not Found.");
  }

  public static void display(Node start, Scanner sc) {

    System.out.println("1.Display from the First Node\n2.Display from the Last Node.");
    int ch = sc.nextInt();
    Node temp;

    switch (ch) {
      case 1:
        temp = start;
        while (temp != null) {
          System.out.println("Reg.No & Marks : " + temp.reg_no + " " + temp.mark);
          temp = temp.next;
        }
        break;
      case 2:
        temp = start;
        while (temp != null && temp.next != null) {
          temp = temp.next;
        }
        while (temp != null) {
          System.out.println("Reg.No & Marks : " + temp.reg_no + " " + temp.mark);
          temp = temp.prev;
        }
        break;

      default:
        break;
    }
  }

  public static Node create(Node start, Scanner sc) {
    int ch;
    long reg_no;
    float mark;

    System.out.print("Enter your Regestration.No : ");
    reg_no = sc.nextLong();
    System.out.print("Enter your Marks : ");
    mark = sc.nextFloat();
    Node newNode = new Node(reg_no, mark);

    start = newNode;

    while (true) {

      System.out.println("Enter 0 to exit of any Key to Create a Another Node.");
      System.out.print("Enter your choice : ");
      ch = sc.nextInt();

      if (ch != 0) {
        start = InsBeg(start, sc);
        continue;
      } else {
        break;
      }
    }
    return start;
  }

  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      Node start = null;
      int ch;
      do {
        System.out.println("****MENU*****");
        System.out.println("0:Exit");
        System.out.println("1.Create a Node.");
        System.out.println("2:Insert At Start of the Node.");
        System.out.println("3:Insert At End of the Node.");
        System.out.println("4:Insert At any place the Node.");
        System.out.println("5:Delete At Start of the Node.");
        System.out.println("6:Delete At End of the Node.");
        System.out.println("7:Delete At any place the Node.");
        System.out.println("8:Display the Linked List.");
        System.out.println("9:Sort the Linked List.");
        System.out.println("10:Count the number of Nodes in a Linked List.");
        System.out.println("11:Search and Update a Linked List.");
        System.out.println("12:Reverse a Linked List.");
        System.out.println("Enter your choice : ");
        ch = sc.nextInt();

        switch (ch) {
          case 0:
            System.out.println("Exiting Program...");
            break;
          case 1:
            start = create(start, sc);
            break;
          case 2:
            start = InsBeg(start, sc);
            break;
          case 3:
            start = InsEnd(start, sc);
            break;
          case 4:
            start = InsAny(start, sc);
            break;
          case 5:
            start = DelBeg(start);
            break;
          case 6:
            start = DelEnd(start);
            break;
          case 7:
            start = DelAny(start, sc);
            break;
          case 8:
            display(start, sc);
            break;
          case 9:
            sort(start, sc);
            break;
          case 10:
            int cnt = count(start);
            System.out.println("No.of Nodes : " + cnt);
            System.out.println("Enter any key to continue: ");
            sc.nextLine();
            sc.nextLine();
            break;
          case 11:
            search(start, sc);
            break;
          case 12:
            start = reverse(start);
            break;
          default:
            System.out.println("Wrong choice.");
            System.out.print("Enter any key to continue: ");
            sc.nextLine();
            break;
        }
      } while (ch != 0);

      sc.close();
    } catch (Exception e) {
      System.err.println("Error : " + e);
    }
  }
}
