package semester_2.dsa_assignment_3.home_assignment;

public class A3Q3 {
  public static void binaryEquivalent(int n) {
    while (n == 0) {
      return;
    }
    binaryEquivalent(n / 2);
    System.out.print(n % 2);
  }

  public static void main(String[] args) {
    int n = 5;
    System.err.print("Binary of " + n + " : "); binaryEquivalent(n);
  }
}
