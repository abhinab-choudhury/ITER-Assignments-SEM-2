package semester_2.dsa_assignment_2.Student_Info;

import java.util.Scanner;

public class Student {
  String name;
  int roll;

  public void inputDetails() {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter the Name of the Student : ");
    this.name = obj.nextLine();
    System.out.print("Enter the Roll No. of the Student : ");
    this.roll = obj.nextInt();

    obj.close();
  }

  public void showDetails() {
    System.out.println("Name : " + this.name);
    System.out.println("Roll Number : " + this.roll);
  }
}
