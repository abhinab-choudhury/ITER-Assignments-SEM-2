package semester_2.dsa_assignment_2.home_assignment;

import java.util.Scanner;

class Book {
  String BName;
  int BEdition, BPrice;

  Book(String tName, int BEdition, int BPrice) {
    this.BName = tName;
    this.BEdition = BEdition;
    this.BPrice = BPrice;
  }
  
  public void display() {
    System.out.println("Name of the Book : " + this.BName);
    System.out.println("Edition : " + this.BEdition);
    System.out.println("Price : " + this.BPrice);
  }
}

public class A2Q2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter the number of Books you want to Purchase : ");
    int N = obj.nextInt();
    obj.nextLine();

    Book book[] = new Book[N];
    int max_price_idx = 0;
    int max_price = Integer.MIN_VALUE;

    for(int i = 0;i < N;i++) {
      System.out.print("Enter the Name of the Book : ");
      String TName = obj.nextLine();
      System.out.print("Enter the Edition of the Book : ");
      int TEdition = obj.nextInt();
      System.out.print("Enter the Price of the Book : ");
      int TPrice = obj.nextInt();
      obj.nextLine();

      book[i] = new Book(TName, TEdition, TPrice);
    }


    // Find max price book
    for(int i = 0;i < N;i++) {
      if(max_price > book[i].BPrice) {
        max_price_idx = i;
      }
    } 

    System.out.println("\n\nMaximum Priced Book : \n");
    book[max_price_idx].display();

    obj.close();
  }
}
