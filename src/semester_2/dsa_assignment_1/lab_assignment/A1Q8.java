package semester_2.dsa_assignment_1.lab_assignment;

import java.util.Scanner;

public class A1Q8 {

  public static void printArray(int arr2D[][]) {
    for (int i = 0; i < arr2D.length; i++) {
      for (int j = 0; j < arr2D[0].length; j++) {
        System.out.print(arr2D[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter number of Row and Columns of 2D-Array: ");
    int rows = obj.nextInt();
    int cols = obj.nextInt();
    int arr[][] = new int[rows][cols];
    int sum = 0;

    System.out.print("Enter elements of 2D-Array: ");
    for(int i = 0;i < rows;i++) {
      for(int j = 0;j < cols;j++) {
        arr[i][j] = obj.nextInt();
        sum += arr[i][j];
      }
    }
    System.out.println("The elements of 2D array are: ");
    printArray(arr);
    System.out.println("The sum of elements of the 2D-Array is " + sum);

    obj.close();
  }
}
