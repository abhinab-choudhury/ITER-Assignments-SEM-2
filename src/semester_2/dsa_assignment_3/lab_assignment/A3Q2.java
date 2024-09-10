package semester_2.dsa_assignment_3.lab_assignment;

import java.util.Scanner;

public class A3Q2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    String color[] = {"Red", "Yellow", "Green", "Blue", "Purple", "Black", "White"};
    try{
      System.out.println("Enter the Idx[0-6]");
      int idx = obj.nextInt();

      System.out.println("Color in Index: " + color[idx]);
    } catch (IndexOutOfBoundsException | NullPointerException  e) {
      System.out.println(e);
    } finally {
      obj.close();
    }
    
  }
}
