package semester_2.dsa_assignment_1.lab_assignment;

public class A1Q1 {
  
  public static int DivideBy2(double N) {
    int cnt = 0;

    while(N/2 > 2) {
      cnt++;
      N /= 2;
    }
    return cnt;
  }

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    System.out.printf("The positive integer greater than 2 from command line argument is %d.\n",n);
    System.out.printf("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is %d.\n", DivideBy2(n * 1.0));
  }
}
