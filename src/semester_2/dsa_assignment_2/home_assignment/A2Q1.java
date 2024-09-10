package semester_2.dsa_assignment_2.home_assignment;

import java.util.Scanner;

class Commission {
  float sales;

  Commission(Float sales) {
    this.sales = sales;
  }

  public double getCommission() {
    if (this.sales > 0 && this.sales < 500) {
      return 0.02 * sales;
    } else if (this.sales >= 500 && this.sales < 5000) {
      return 0.05 * sales;
    } else if (this.sales >= 5000) {
      return 0.08 * sales;
    } else {
      return 0.0;
    }
  }
}

class Demo {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the amount of Sales : ");
    float sales = obj.nextFloat();
    obj.close();
    
    if (sales < 0) {
      System.out.println("Invalid Input");
      return;
    }

    Commission com = new Commission(sales);
    System.err.println("Commission of sales : " + com.getCommission());
  }
}

public class A2Q1 {
  Demo demo = new Demo();
}
