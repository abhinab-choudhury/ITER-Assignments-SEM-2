package semester_2.dsa_assignment_3.home_assignment;

public class A3Q6 {
  static int k = 0;
  static String reverseStr = "";

  public static String stringReverse(String str) {
    if (str.length() == k) {
      return "";
    }
    stringReverse(str.substring(k + 1, str.length()));
    reverseStr += str.charAt(k);
    return reverseStr;
  }

  public static void main(String[] args) {
    String str = "racecar";
    
    reverseStr = stringReverse(str);
    
    System.out.println("Reverse of \"" + str + "\" is : " + reverseStr);
    System.out.print("Is Palindrome: ");
    if(reverseStr.equals(str)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
