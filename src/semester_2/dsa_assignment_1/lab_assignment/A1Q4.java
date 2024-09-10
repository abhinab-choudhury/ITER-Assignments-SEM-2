 package semester_2.dsa_assignment_1.lab_assignment;

import java.util.Scanner;

public class A1Q4 {
  public static void permutationString(String ans_str,String str, boolean freq[]) {
    if(ans_str.length() == str.length()) {
      System.out.println(ans_str);
      return;
    }
    for(int i = 0;i < str.length();i++) {
      if(!freq[i]) {
        ans_str += str.charAt(i) + "";
        freq[i] = true;
        permutationString(ans_str, str, freq);
        freq[i] = false;
        ans_str = ans_str.substring(0, ans_str.length() - 1);
      }
    }
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter a string : ");
    String str = obj.next();
    boolean []freq = new boolean[str.length()];
    permutationString("",str,freq);

    obj.close();
  }
}
