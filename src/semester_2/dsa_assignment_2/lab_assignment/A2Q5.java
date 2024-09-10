package semester_2.dsa_assignment_2.lab_assignment;

class Person1 {
  String name;
  int age;

  Person1(String name, int age) {
    this.name = name;
    this.age = age;
  }

}

class Employee extends Person1 {
  int Eid;
  double salary;

  Employee(String name, int age, int Eid, double salary) {
    super(name, age);
    this.Eid = Eid;
    this.salary = salary;
  }
  
  public void empDisplay() {
    System.out.println("Name of Employee : " + this.name);
    System.out.println("Age of " + this.name + " : " + this.age);
    System.out.println("Employee ID of " + this.name + " : " + this.Eid);
    System.out.println("Salary of " + this.name + " : " + this.salary);
  }

}

public class A2Q5 {
  public static void main(String[] args) {
    Employee employee1 = new Employee("Abhinab", 19, 90291, 45000.60);
    employee1.empDisplay();
  }
}
