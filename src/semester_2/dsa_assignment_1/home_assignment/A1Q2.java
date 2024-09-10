package semester_2.dsa_assignment_1.home_assignment;

import java.util.Scanner;

public class A1Q2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter number of lines you want to enter : ");
    int n = obj.nextInt();
    obj.nextLine();

    String arr[] = new String[n];

    System.out.println("Enter " + n + " number of lines : ");
    int k = 0;
    while(n > 0) {
      arr[k] = obj.nextLine();
      k++;
      n--;
    } 

    System.out.println("Reverse of Lines : ");
    for(int i = arr.length-1;i >= 0;i--) {
      System.out.println(arr[i]);
    }
    obj.close();
  }
}
