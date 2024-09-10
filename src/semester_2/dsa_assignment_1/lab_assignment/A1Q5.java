package semester_2.dsa_assignment_1.lab_assignment;

import java.util.Scanner;

public class A1Q5 {
  public static int sum_Of_Digits(int n) {
    int t = n, sum = 0;

    while(true) {
      sum = 0;
      while(t > 0) {
        sum += t % 10;
        t /= 10;
      }
      if(sum <= 9) {
        return sum;
      }
      t = sum;
    }
  }
  public static void main(String[] args) {
    
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter a number "); 
    int n = obj.nextInt();
    System.out.printf("Sum of digits of %d until the number is a single digit is %d.\n", n, sum_Of_Digits(n));

    obj.close();
  }
}
