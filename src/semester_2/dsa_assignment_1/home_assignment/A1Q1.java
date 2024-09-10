package semester_2.dsa_assignment_1.home_assignment;

import java.util.Scanner;

public class A1Q1 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter 3 integers a, b, and c,");
    int a = obj.nextInt();
    int b = obj.nextInt();
    int c = obj.nextInt();

    if(a + b == c) {
      System.out.println("a + b = c");
    } else if( a * b == c) {
      System.out.println("a.b = c");
    } else if(a == b - c) {
      System.out.println("a = b - c");
    }

    obj.close();
  }
}
