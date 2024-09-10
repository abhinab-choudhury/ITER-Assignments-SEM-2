package semester_2.dsa_assignment_2.lab_assignment;

import java.util.Scanner;

class Complex {
  // instance variable
  float real,imag;

  void setData() {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter the Real part of the Complex Number : ");
    this.real = obj.nextFloat();
    System.out.print("Enter the Imaginary part of the Complex Number : ");
    this.imag = obj.nextFloat();
   
    obj.close();
  }

  void displayData() {
    System.out.println(this.real + ((this.imag >= 0.0f) ? " + i" : " - i") +Math.abs(this.imag));
  }

  public Complex add(Complex c1, Complex c2) {
    Complex sum = new Complex();
    sum.real = c1.real + c2.real;
    sum.imag = c1.imag + c2.imag;
    return sum;
  }
}

public class A2Q2 {

  public static void main(String[] args) {
    Complex c1 = new Complex();
    System.out.println("Enter first Complex Number : ");
    c1.setData();
    Complex c2 = new Complex();
    System.out.println("Enter second Complex Number : ");
    c2.setData();

    System.out.print("First Complex Number : ");
    c1.displayData();
    System.out.print("Second Complex Number : ");
    c2.displayData();

    Complex sum = c1.add(c1, c2);
    System.out.print("Sum :");
    sum.displayData();

  }
}
