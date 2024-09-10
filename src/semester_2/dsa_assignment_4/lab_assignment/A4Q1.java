
package semester_2.dsa_assignment_4.lab_assignment;

import java.util.Scanner;

class Node {
  protected long reg_no;
  protected float mark;
  protected Node link;
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

public class A4Q1 {

  public static Node InsBeg(Node start, Scanner sc) {
    Node newNode = new Node();

    System.out.print("Enter your Regestration.No : ");
    newNode.reg_no = sc.nextLong();
    System.out.print("Enter your Marks : ");
    newNode.mark = sc.nextFloat();

    newNode.link = start;
    // start = newNode;

    return newNode;
  }

  public static Node InsEnd(Node start, Scanner sc) {
    Node newNode = new Node();

    System.out.print("Enter your Regestration.No : ");
    newNode.reg_no = sc.nextLong(); 
    System.out.print("Enter your Marks : ");
    newNode.mark = sc.nextFloat();

    newNode.link = null;

    if (start == null) {
      start = newNode;
    } else {
      Node copy = start;
      while (copy.link != null) {
        copy = copy.link;
      }
      copy.link = newNode;
    }

    return start;
  }

  public static Node InsAny(Node start, Scanner sc) throws EmptyLinkedListException {
    System.out.println("Enter the Position [1-Based Indexing] : ");
    int Position = sc.nextInt();
    int length = count(start);

    if (Position <= length) {
      int cnt = 1;

      Node temp = start, prev = start;
      while (cnt != Position) {
        prev = temp;
        temp = temp.link;
        cnt++;
      }

      // Input:
      Node newNode = new Node();
      System.out.print("Enter your Regestration.No : ");
      newNode.reg_no = sc.nextLong();
      System.out.print("Enter your Marks : ");
      newNode.mark = sc.nextFloat();

      int ch;
      do {
        System.out
            .println("Do you want to:\n0.Exit.\n1.Insert Data Before the Position.\n2.Insert Data After the Position.");
        ch = sc.nextInt();
        switch (ch) {
          case 1:
            // setting up the link-part
            prev.link = newNode;
            newNode.link = temp;
            break;
          case 2:
            newNode.link = temp.link;
            temp.link = newNode;
            break;
          default:
            System.out.println("Wrong choice.");
            break;
        }
      } while (ch != 0);

    } else {
      throw new EmptyLinkedListException("Empty Linked List.Insertation Operation Cannot be performed");
    }
    return start;
  }

  public static Node DelBeg(Node start) throws EmptyLinkedListException {

    if (start == null) {
      throw new EmptyLinkedListException("Linked List is Empty.");
    }
    Node copy = start;
    start = start.link;
    copy.link = null;

    return start;
  }

  public static Node DelEnd(Node start) throws EmptyLinkedListException {
    if (start == null) {
      throw new EmptyLinkedListException("Linked List is Empty. \nDelection Operation Cannot be Performed.");
    }
    Node prev = null, copy = start;
    while (copy.link != null) {
      prev = copy;
      copy = copy.link;
    }

    prev.link = null;

    return start;
  }

  public static Node DelAny(Node start, Scanner sc) throws LinkedOutOfBoundException {
    System.out.println("Enter the Position [1-Based Indexing] : ");
    int Position = sc.nextInt();
    int length = count(start);

    if (Position <= length) {
      int cnt = 1;

      Node temp = start, prev = start;
      while (cnt != Position) {
        prev = temp;
        temp = temp.link;
        cnt++;
      }
      prev.link = temp.link;
      temp.link = null;
    } else {
      throw new LinkedOutOfBoundException("Empty Linked List.Insertation Operation Cannot be performed");
    }
    return start;
  }

  public static int count(Node start) {
    int cnt = 0;
    Node copy = start;

    while (copy != null) {
      cnt++;
      copy = copy.link;
    }

    return cnt;
  }

  public static void sort(Node start, Scanner sc) {
    System.out.println("1.Sort According to Marks.\n2.Sort According to Registration Number.");
    int ch = sc.nextInt();
    for (Node i = start; i.link != null; i = i.link) {
      for (Node j = start; j != null; j = j.link) {
        if (ch == 1) {
          if (j.mark >= j.link.mark) {
            float temp1 = j.mark;
            j.mark = j.mark;
            j.mark = temp1;

            long temp2 = j.reg_no;
            j.reg_no = j.reg_no;
            j.reg_no = temp2;
          }
        } else if (ch == 2) {
          if (j.reg_no >= j.link.reg_no) {
            float temp1 = j.mark;
            j.mark = j.mark;
            j.mark = temp1;

            long temp2 = j.reg_no;
            j.reg_no = j.reg_no;
            j.reg_no = temp2;
          }
        } else {
          System.out.println("Wrong Choise.");
          System.exit(0);
        }
      }
    }
  }

  public static Node reverse(Node start) {
    Node prev = null;
    Node curr = start;
    while (curr != null) {
      Node temp = curr.link;
      curr.link = prev;
      prev = curr;
      curr = temp;
    }
    return prev;
  }

  public static void search(Node start, Scanner sc) {
    System.out.println("Enter the Reg.No of the Student, and the updated marks of the Student : ");
    long key = sc.nextLong();
    int newMark = sc.nextInt();

    Node found = new Node();

    if (start == null) {
      System.out.println("Linked List is Empty.");
      return;
    }

    found = start;
    while (found != null) {
      if (found.reg_no == key) {
        found.mark = newMark;

        System.out.println("Node Found: Successfully");
        System.out.println("Reg.No : " + found.reg_no);
        System.out.println("Marks : " + found.mark);

        System.out.println("Enter any key to continue: ");
        sc.nextLine();
        sc.nextLine();
        return;
      }
      found = found.link;
    }

    System.out.println("Cannot Find the Node.");
    System.out.println("Enter any key to continue: ");
    sc.nextLine();
    sc.nextLine();
  }

  public static void display(Node start, Scanner sc) {
    if (start == null) {
      System.out.println("Linked List is Empty.");
    } else {
      Node c = start;
      while (c != null) {
        System.out.println("Reg.No & Marks : " + c.reg_no + " " + c.mark);
        c = c.link;
      }
    }

    System.out.print("Enter any key to continue: ");
    sc.nextLine();
    sc.nextLine();
  }

  public static Node create(Node start, Scanner sc) {
    int ch;
    Node newNode;

    do {
      newNode = new Node();
      System.out.print("Enter your Regestration.No : ");
      newNode.reg_no = sc.nextLong();
      System.out.print("Enter your Marks : ");
      newNode.mark = sc.nextFloat();
      newNode.link = start;
      start = newNode;

      System.out.println("0.Exit.");
      System.out.println("Enter 0 to exit of any Key to Create a Another Node.");
      System.out.print("Enter your choice : ");
      ch = sc.nextInt();
    } while (ch != 0);
    return newNode;
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
