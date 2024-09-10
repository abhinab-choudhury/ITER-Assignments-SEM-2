package semester_2.dsa_assignment_2.lab_assignment;

import java.util.Scanner;

class Product {
  String prodId;
  float price;
  int quantity;
  static float totalPrice;
  
  public Product(String prodID,float price,int quantity) {
    this.prodId = prodID;
    this.price = price;
    this.quantity = quantity;
    Product.totalPrice += this.price * this.quantity;
  }

  void display() {
    System.out.println("Product Details : ");
    System.out.println("Product ID : " + this.prodId);
    System.out.println("Price : " + this.price);
    System.out.println("Quantity : " + this.quantity);
  }
}

public class A2Q3 {

  public static void main(String[] args) {
	
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter the Number of Products you purchased: ");
    int num = obj.nextInt();
    Product p[] = new Product[num];

    for(int i = 0;i < num;i++) {
    	
      System.out.println("Product No." + (i + 1));
      System.out.print("Enter the Product ID : ");
      String prod_id = obj.next();
      System.out.print("Enter the price (Each) : ");
      float price = obj.nextFloat();
      System.out.print("Enter the Quantity : ");
      int quantity = obj.nextInt();
      
      p[i] = new Product(prod_id, price, quantity);
      
    }

    for(int i = 0;i < num;i++) {
      p[i].display();
    }

    System.out.println("Total Price " + Product.totalPrice);

    obj.close();
  }
}
