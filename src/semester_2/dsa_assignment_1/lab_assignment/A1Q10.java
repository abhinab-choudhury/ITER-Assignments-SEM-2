package semester_2.dsa_assignment_1.lab_assignment;

import java.util.Scanner;

public class A1Q10 {
  
  public static double sumColumn(double[][] m, int columnIndex) {
    double sum = 0;
    for(int i = 0;i < m.length;i++) {
       sum += m[i][columnIndex];
    }

    return sum;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    double arr[][] = new double[3][4];
    System.out.println("Enter a 3-by-4 matrix row by row: ");
    for(int i = 0;i < 3;i++) {
      for(int j = 0;j < 4;j++) {
        arr[i][j] = obj.nextDouble();
      }
    }

    for(int j = 0;j < 4;j++) {
      System.out.printf("Sum of the elements at column %d is %.3f\n", j, sumColumn(arr, j));
    }

    obj.close();
  }
}
