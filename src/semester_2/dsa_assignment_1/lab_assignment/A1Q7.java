package semester_2.dsa_assignment_1.lab_assignment;

import java.util.Scanner;

public class A1Q7 {
  public static int[] findMaxMinCnt(int arr[], int sz) {
    int max = Integer.MIN_VALUE, max_cnt = 0, max_first = -1;
    int min = Integer.MAX_VALUE, min_cnt = 0, min_last = -1;

    for(int i = 0;i < sz;i++) {
      if(arr[i] > max) {
        max = arr[i];
        max_first = i;
        max_cnt = 0;
      } 
      if(arr[i] < min) {
        min = arr[i];
        min_cnt = 0;
      }

      if(arr[i] == max) {
        max_cnt++;
      }
      if (arr[i] == min){
        min_cnt++;
        min_last = i;
      }
    }

    int[] results = {max, min, max_cnt, min_cnt, max_first + 1, min_last + 1};

    return results;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter number of elements of Array: "); 
    int n = obj.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter elements of the array: ");
    for(int i = 0;i < n;i++) {
      arr[i] = obj.nextInt();
    }

    int ans[] = findMaxMinCnt(arr, n);
    System.out.printf("Maximum element of Array is %d and occurs %d times.\n", ans[0], ans[2]);
    System.out.printf("Maximum element of Array is %d and occurs %d times.\n", ans[1], ans[3]);
    System.out.printf("First occurrence of maximum element is at position %d.\n", ans[4]);
    System.out.printf("First occurrence of minimum element is at position %d.\n", ans[5]);

    obj.close();
  }
}
