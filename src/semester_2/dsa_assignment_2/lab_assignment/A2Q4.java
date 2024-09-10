 package semester_2.dsa_assignment_2.lab_assignment;

class Deposit {
  long Principal;
  int Time;
  double Rate,TotalAmt;

  Deposit() {
    this.Principal = 0;
    this.Time = 0;
    this.Rate = 0;
  }

  Deposit(long Principal, int Time, double Rate) {
    this.Principal = Principal;
    this.Time = Time;
    this.Rate = Rate;
  }

  Deposit(long Principal, int Time) {
    this.Principal = Principal;
    this.Time = Time;
    this.Rate = 0.0;
  }

  Deposit(long Principal, double Rate) {
    this.Principal = Principal;
    this.Time = 0;
    this.Rate = Rate;
  }

  public void display() {
    System.out.println("Principal : " + this.Principal);
    System.out.println("Time : " + this.Time);
    System.out.println("Rate : " + this.Rate);
    calcAamt();
    System.out.println("Amount : " + this.TotalAmt);
  }

  public void calcAamt() {
    this.TotalAmt = this.Principal + ((this.Principal * this.Time * this.Rate)/100);
  }
}

public class A2Q4 {
  public static void main(String[] args) {
    Deposit D1 = new Deposit();
    D1.Principal = 1450000;
    D1.Rate = 4.5;
    D1.Time = 12;
    D1.display();
    Deposit D2 = new Deposit(1450000, 12, 4.5);
    D2.display();
    Deposit D3 = new Deposit(1450000, 12);
    D3.Rate = 4.5;
    D3.display();
    Deposit D4 = new Deposit(1450000, 4.5);
    D4.Time = 12;
    D4.display();
  }
}
