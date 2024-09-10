package semester_2.dsa_assignment_1.lab_assignment;

import java.util.Scanner;

public class A1Q2 {
  public static String BMI(double weight, double height) {
    double BMI = weight/Math.pow(height, 2);

    if(BMI < 18.5) {
      return "Underweight";
    } else if(BMI >= 18.5 && BMI < 25) {
      return "Normal Weight";
    } else if(BMI >= 25 && BMI < 30) {
      return "Overweight";
    } else { // BMI >= 30
      return "Obess";
    }
  }
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter person Weight in kg: ");
    double weight = obj.nextDouble();
    System.out.print("Enter height of person in meter:");
    double height = obj.nextDouble();
    System.out.printf("The person is %s.\n",BMI(weight, height));

    obj.close();
  }
}
