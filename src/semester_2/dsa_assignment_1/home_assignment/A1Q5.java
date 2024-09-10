package semester_2.dsa_assignment_1.home_assignment;

import java.util.Scanner;

public class A1Q5 {

  public static int[] largestRowCol(int arr[][]) {
    int max_row = -1, max_col = -1, mrow_sum = -1, mcol_sum = -1;
    for(int i = 0;i < 4;i++) {
      int sum_col = 0,sum_row = 0;
      for(int j = 0;j < 4;j++) {
        sum_row += arr[i][j];
        sum_col += arr[j][i];
      }
  	  if(sum_col > mcol_sum) {
        max_col = i;
        mcol_sum = sum_col;
      }
      if(sum_row > mrow_sum) {
        max_row = i;
        mrow_sum = sum_row;
      }
    }

    int results[] = {max_row, max_col};
    return results;
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    int arr[][] = new int[4][4];
    for(int i = 0;i < 4;i++) {
      for(int j = 0;j < 4;j++) {
        arr[i][j] = (int)(Math.round(Math.random())) ;
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
   
    int ans[] = largestRowCol(arr);
    System.out.println("The largest row index: " +  ans[0]);
    System.out.println("The largest column index: " +  ans[1]);
    obj.close();
  }
}
