package semester_2.dsa_assignment_1.home_assignment;

import java.util.Scanner;

public class A1Q3 {

  public static int[] dotProduct(int vecA[], int vecB[]) {
    int dotProd[] = new int[vecA.length];

    for(int i = 0;i < dotProd.length;i++) {
      dotProd[i] = vecA[i] * vecB[i];
    }

    return dotProd;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the size of the Vector : ");
    int n = obj.nextInt();
    int vecA[] = new int[n];
    int vecB[] = new int[n];

    System.out.println("Enter Vector A - [Axis Cofficient] : ");
    for(int j = 0;j < n;j++) {
      vecA[j] = obj.nextInt();
    }
    
    System.out.println("Enter Vector B - [Axis Cofficient] : ");
    for(int j = 0;j < n;j++) {
      vecB[j] = obj.nextInt();
    }

    System.out.print("<A> . <B> = <");
    int vecC[] = dotProduct(vecA, vecB);
    for (int i = 0; i < n; i++) {
      if(i == n - 1) {
        System.out.println(vecC[i] + ">");
      } else {
        System.out.print(vecC[i] + ",");
      }
    }
    obj.close();
  }
}
