package semester_2.dsa_assignment_3.lab_assignment;

import java.util.Scanner;

public class A3Q1 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    int number = obj.nextInt();

    try{
      if (number < 0)
				throw new NumberFormatException("Lucky number cannot be -ve ");
			else 
				System.out.println("Your lucky number is = " + number);
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      obj.close();
    }
    
  
   }
}
