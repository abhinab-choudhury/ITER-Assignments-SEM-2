package semester_2.dsa_assignment_3.lab_assignment;

public class A3Q9 {

  public static void reverse(int num) {
    if (num < 10) {
      System.out.println(num);
    } else {
      System.out.print(num % 10);
      reverse(num / 10);
    }
  }

  public static void main(String[] args) {
    int n = 1234567;
    System.out.print("Reverse of " + n + " is : ");
    reverse(n);
  }
}
