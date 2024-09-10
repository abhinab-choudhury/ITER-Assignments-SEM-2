package semester_2.dsa_assignment_3.home_assignment;

public class A3Q5 {
  static int k = 0;
  public static void reverseString(String str) {
    if (str.length() == k) {
      return;
    }
    reverseString(str.substring(k + 1, str.length()));
    System.out.print(str.charAt(k));
  }

  public static void main(String[] args) {
    String str = "pans";
    System.out.print("Reverse of \"" + str + "\" is : ");
    reverseString(str);
  }
}
