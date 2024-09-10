package semester_2.dsa_assignment_2.home_assignment;

import java.util.Scanner;

class Bank {
  String bankName; 
  int depositAmount;
  static int totalAmount;


  public void setBankName(String name) {
    this.bankName = name;
  }

  public void setAmount(int amount) { 
    this.depositAmount = amount;
    Bank.totalAmount += this.depositAmount;
  }

  public void findMinimum(Bank arr[]) {
    int minDesposite = Integer.MAX_VALUE;
    int minDesposite_idx = 0;

    for(int i = 0;i < arr.length;i++) {
      if(arr[i].depositAmount < minDesposite) {
        minDesposite = arr[i].depositAmount;
        minDesposite_idx = i;
      }
    }

    arr[minDesposite_idx].showData();
  }
  public void showData() {
    System.out.println("Name of the Bank : " + this.bankName);
    System.out.println("Total Deposite Amount : " + this.depositAmount);
  }
}

public class A2Q3 {
  public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);
    Bank arr[] = new Bank[5];

    System.out.println("Enter Data As Asked : ");
    for(int i = 0;i < arr.length;i++) {
      arr[i] = new Bank();
     
      System.out.print("Enter the Name of the Bank : ");
      String name = obj.next();
      arr[i].setBankName(name);

      System.out.print("Enter the Deposit Amount : ");
      int amount = obj.nextInt();

      if(amount < 1000) {
        System.out.println("The Minimum Deposit Amount is Rs.1000.\nInvalid Enter.\nTry Again!!!!!");
        i--;
      } else {
        arr[i].setAmount(amount);
      }
    }

    System.out.println("Minimum Amount is Deposited At : ");
    arr[0].findMinimum(arr);
    System.out.println("Total Amount : " + Bank.totalAmount);

    obj.close();
  }
}
