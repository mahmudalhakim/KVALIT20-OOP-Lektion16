/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-23
 * Time: 11:41
 * Project: Lektion16
 * Copyright: MIT
 */
public class PointDemo {
  public static void main(String[] args) {

    // Skapa några punkter
    Point p1 = new Point();
    Point p2 = new Point();

    // Skriv ut referensvariabler
    System.out.println("p1 = " + p1);
    System.out.println("p2 = " + p2);

    // Skriv ut punkterna
    print(p1, p2);

    // Flytta punkt 1 (p1)
    p1.x = 5;   // Flytta 5 steg till höger
    p1.y = -5;  // Flytta 5 steg neråt

    // Beräkna avståndet mellan p1 och p2
    double d = Point.distance(p1, p2);
    System.out.printf("Avstånd = %.2f \n", d);

    // Flytta punkt 1
    p1.x = 10;
    p1.y = 0;

    // Skriv ut punkterna
    print(p1, p2);

    System.out.printf("Avstånd = %.2f \n", Point.distance(p1, p2));
    System.out.printf("Avstånd = %.2f \n", Point.distance(p2, p1));

    // Flytta punkt 1
    p1.x = 3;
    p1.y = 4;

    print(p1, p2);

    System.out.printf("Avstånd = %.2f \n", Point.distance(p1, p2));


    // Beräkna mittpunkten
    Point midpoint = Point.midPoint(p1, p2);
    System.out.print("Mittpunkten är " );
    Point.print(midpoint);


  }

  /**
   * En privat hjälpmetod som skriver ut 2 punkter
   *
   * @param p1 den första punkten
   * @param p2 den andra punkten
   */
  private static void print(Point p1, Point p2) {
    System.out.println("p1(" + p1.x + " , " + p1.y + ")");
    System.out.println("p2(" + p2.x + " , " + p2.y + ")");
  }
}
