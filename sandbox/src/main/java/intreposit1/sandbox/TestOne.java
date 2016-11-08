package intreposit1.sandbox;

public class TestOne {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println(2 + 2);

    Square s=new Square(5);
      System.out.println("Area of square with side "+s.l+" = "+s.area());

    Rectangle r=new Rectangle(5, 3);
    System.out.println("Area of rectangle with sides "+r.a+" and "+r.b+" = "+ r.area());

  }




  public static double area(Rectangle r) {

    return r.a * r.b;
  }
}