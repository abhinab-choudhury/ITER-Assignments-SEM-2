package semester_2.dsa_assignment_3.home_assignment;

public class A3Q1 {
  public static int GCD(int a, int b) {
    if (b == 0) {
      return a;
    }

    return GCD(b, a % b);
  }

  public static void main(String[] args) {
    int n = 20, m = 5;
    System.out.println("GCD(" + n + "," + m + ") : " + GCD(n, m));
  }
}
