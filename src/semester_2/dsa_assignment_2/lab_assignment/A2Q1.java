package semester_2.dsa_assignment_2.lab_assignment;

import java.util.Scanner;

class Person {
  String name;
  int age;

  public void setData() {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter your Name : ");
    this.name = obj.next();
    System.out.print("Enter your Age : ");
    this.age = obj.nextInt();
    
    obj.close();
  }

  public void displayData() {
    System.out.println("Personal information: ");
    System.out.println("Name : " + this.name);
    System.out.println("Age : " + this.age);
  }
}

public class A2Q1 {

  public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person();

    p1.name = "Rohan";
    p1.age = 20;

    p2.setData();
    p1.displayData();
    p2.displayData();

    if (p1.age > p2.age) {
      System.out.println(p1.name + " is older than " + p2.name);
    } else if (p1.age < p2.age) {
      System.out.println(p2.name + " is older than " + p1.name);
    } else {
      System.out.println(p1.name + " and " + p2.name + " are of same age.");
    }
  }
}