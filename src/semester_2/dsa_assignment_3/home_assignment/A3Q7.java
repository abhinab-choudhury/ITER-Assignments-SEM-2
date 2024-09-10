package semester_2.dsa_assignment_3.home_assignment;

import java.util.Scanner;

public class A3Q7 {
  public static void rearrange(int[] arr, int low, int high, int k) {
    if (low < high) {
      // Find the partition index using a modified partition scheme from QuickSort
      int pivot = partition(arr, low, high, k);

      // Recur for elements before partition (<= k)
      rearrange(arr, low, pivot - 1, k);

      // Recur for elements after partition (> k)
      rearrange(arr, pivot + 1, high, k);
    }
  }

  private static int partition(int[] arr, int low, int high, int k) {
    // int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
      if (arr[j] <= k) {
        i++;
        swap(arr, i, j);
      }
    }

    // Place pivot element (which should be > k) at its final position
    swap(arr, i + 1, high);
    return i + 1;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.print("k :");
    int k = obj.nextInt();
    int arr[] = { 3, 9, 8, 9, 2, 3, 8, 2, 9, 6, 5, 4 };

    rearrange(arr, 0, arr.length - 1, k);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    obj.close();
  }
}
