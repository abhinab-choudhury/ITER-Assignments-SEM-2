package semester_2.dsa_assignment_2.lab_assignment;

import java.util.Scanner;

interface DetailInfo {
  public void display();
  public void count(); 
}

class Person2 implements DetailInfo {
  static int maxcount;
  String name;

  @Override
  public void display() {
    System.out.println("Name : " + this.name);
  }

  @Override
  public void count() {
    for(int i = 0;i < this.name.length();i++) {
      char ch = this.name.charAt(i);
      if(Character.isLetter(ch)) {
        Person2.maxcount++;
      }
    }
  }
}

public class A2Q7 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter you name : ");
    Person2 person = new Person2();
    person.name = obj.nextLine();
    person.count();
    System.out.println("No.of Character : " + Person2.maxcount);

    obj.close();
  }
}
