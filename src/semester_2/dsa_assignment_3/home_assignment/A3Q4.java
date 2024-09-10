package semester_2.dsa_assignment_3.home_assignment;

public class A3Q4 {

  public static int multiply(int x, int y) {
    if (y == 0) {
      return y;
    }
    return x + multiply(x, y-1);
  }

  public static void main(String[] args) {
    int n = 12, m = 15;
    System.out.println(n + " x " + m + " = " + multiply(n, m));
  }
}
