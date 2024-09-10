package semester_2.dsa_assignment_2.Student_Info;

import java.util.Scanner;

public class Test {
  public int mark1, mark2;

  public void inputDetails() {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter mark for Subject 1 : ");
    this.mark1 = obj.nextInt();
    System.out.print("Enter mark for Subject 2 : ");
    this.mark2 = obj.nextInt();

    obj.close();
  }

  public void showDetails() {
    System.out.println("Mark in Subject 1 : " + this.mark1);
    System.out.println("Mark in Subject 2 : " + this.mark2);
  }
}
