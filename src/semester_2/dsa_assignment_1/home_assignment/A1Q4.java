package semester_2.dsa_assignment_1.home_assignment;

import java.util.Scanner;

public class A1Q4 {
  
  public static double[][] addMatrix(double[][] a, double[][] b) {
    double result[][] = new double[a.length][a[0].length];

    for(int i = 0;i < result.length;i++) {
      for (int j = 0; j < result[0].length; j++) {
        result[i][j] = a[i][j] + b[i][j];
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter number/s of rows : ");
    int rows = obj.nextInt();
    System.out.println("Enter number/s of Columns : ");
    int cols = obj.nextInt();

    double a[][] = new double[rows][cols];
    double b[][] = new double[rows][cols];

    System.out.println("Enter values for Matrix A : ");
    for(int i = 0;i < rows;i++) {
      for (int j = 0; j < cols; j++) {
        a[i][j] = obj.nextDouble();
      }
    }

    System.out.println("Enter values for Matrix B : ");
    for(int i = 0;i < rows;i++) {
      for (int j = 0; j < cols; j++) {
        b[i][j] = obj.nextDouble();
      }
    }

    double sum[][] = addMatrix(a, b);
    for(int i = 0;i < rows;i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    }

    obj.close();
  }
}
