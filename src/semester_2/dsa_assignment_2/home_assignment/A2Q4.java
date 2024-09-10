package semester_2.dsa_assignment_2.home_assignment;

class Distance {
  int meters, centimetres;
  
  public Distance(int meters, int centimetres) {
    this.meters = meters;
    this.centimetres = centimetres;
  }

  public void display () {
    System.out.println("Distane : " + this.meters + " m " + this.centimetres + " cm.");
  } 

  public void sum (Distance d1, Distance d2) {
    int m = d1.meters + d2.meters;
    int cm = d1.centimetres + d2.centimetres;

    while (cm > 100) {
      m += 1;
      cm -= 100;
    }
    Distance sum = new Distance(m,cm);
    sum.display();
  }
}

public class A2Q4 {
  public static void main(String[] args) {
    Distance distance1 = new Distance(1, 80);
    System.out.println("Distance 1 : ");
    distance1.display();
    
    Distance distance2 = new Distance(1, 30);
    System.out.println("Distance 2 : ");
    distance2.display();
    
    System.out.println("Total Distance : ");
    distance1.sum(distance1, distance2);
  }
}
