package semester_2.dsa_assignment_2.lab_assignment;

import semester_2.dsa_assignment_2.Student_Info.Student;
import semester_2.dsa_assignment_2.Student_Info.Test;
import semester_2.dsa_assignment_2.Student_Sport.Sport;

public class A2Q8 implements Sport {
  public static void main(String[] args) {
    Student student = new Student();
    Test test = new Test();
    
    student.inputDetails();
    test.inputDetails();
    
    System.out.println("\n\nStudent Details");
    student.showDetails();
    test.showDetails();
    System.out.println("Score 1 : " + score1);
    System.out.println("Score 2 : " + score2);
    
    int grand_total = test.mark1 + test.mark2 + score1 + score2;
    System.out.println("Grand Total : " + grand_total);

  }
}
