package semester_2.dsa_assignment_1.lab_assignment;

import java.util.Scanner;

public class A1Q6 {
  public static boolean isOdd(int n) {
    return ((n&1) == 1)?true:false;
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter a number ");
    int n = obj.nextInt();
    System.out.printf("%d is Odd : %s\n", n , isOdd(n)?"true":"false");

    obj.close();
  }
}
