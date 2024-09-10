package semester_2.dsa_assignment_1.lab_assignment;

import java.util.Scanner;

public class A1Q3 {
  public static boolean isSpyNumber(int n) {
    int sum = 0, prod = 1;
    int t = n;
    // while (t > 0) {
    //   int rem = t % 10;
    //   sum += rem;
    //   prod *= rem;
    //   t /= 10;
    // }
    
    
    for(;t > 0;t /= 10) {
      int rem = t % 10;
      sum += rem;
      prod *= rem;
    }
    if(sum == prod) {
      return true;
    } else {
      return false;
    }
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = obj.nextInt();
    if(isSpyNumber(n)) {
      System.out.printf("%d is a spy number.\n", n);
    } else {
      System.out.printf("%d is a NOT spy number.\n", n);
    }
    obj.close();
  }
}
