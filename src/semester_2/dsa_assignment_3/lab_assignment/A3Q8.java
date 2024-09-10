package semester_2.dsa_assignment_3.lab_assignment;

import java.util.Scanner;

public class A3Q8 {
  public static int power(int x, int n) {
    if(n == 0) {
      return 1;
    }
    if(n == 1) {
      return x;
    }
    return x * power(x, n-1);
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.err.print("x: ");
    int x = obj.nextInt();
    System.out.print("n : ");
    int n = obj.nextInt();

    System.out.println("x^n : " + power(x,n));
    obj.close();
  }
}
