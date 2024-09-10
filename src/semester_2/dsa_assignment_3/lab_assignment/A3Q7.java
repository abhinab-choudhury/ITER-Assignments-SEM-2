package semester_2.dsa_assignment_3.lab_assignment;

public class A3Q7 {
  
  public static int factorial(int n) {
    if (n == 1 || n == 0) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  public static void main(String[] args) {
    System.out.println("Factorial of 5 : " + factorial(5));
  }
}
