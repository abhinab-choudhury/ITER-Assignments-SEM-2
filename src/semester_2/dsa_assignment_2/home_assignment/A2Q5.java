package semester_2.dsa_assignment_2.home_assignment;

class PointType {
  float x_coordinates, y_coordinates;

  public PointType() {
    x_coordinates = 0.0f;
    y_coordinates = 0.0f;
  }

  public void setCoordinates(float x, float y) {
    x_coordinates = x;
    y_coordinates = y;
  }
}

class CircleType extends PointType{
  float radius;
  public CircleType(float x, float y, float radius) {
    super();
    setCoordinates(x, y);
    this.radius = radius;
  }

  public void setRadius(float radius) {
    this.radius = radius;
  }

  public void display() {
    System.out.println("Radius of the Circle : " + this.radius + " m");
  }

  public void calculate() {
    System.out.println("Circumference of the Circle : " + (float)(2 * Math.PI * radius) + " m");
    System.out.println("Area of the Circle : " + (float)(Math.PI * radius * radius) + " sq.m");
  }
}

public class A2Q5 {
  public static void main(String[] args) {
    CircleType circle = new CircleType(1.2f, 3.4f, 6.2f);
    circle.display();
    circle.calculate();
    System.err.println("If Radius is Updated to : 5.3 m");
    circle.setRadius(5.3f);
    System.out.println("Updated Result : ");
    circle.calculate();
  }
}
