package semester_2.dsa_assignment_3.home_assignment;

public class A3Q2 {

  public static int search(int arr[], int k, int s, int e, int m) {
    if (arr[m] == k) {
      return m;
    }
    int idx = (arr[m] > k ? search(arr, k, s, m, (s + m) / 2) : search(arr, k, m + 1, e, (m + e + 1) / 2));
    return idx;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    System.out.println("Index : " + search(arr, 1, 0, 4, 2));
  }
}
