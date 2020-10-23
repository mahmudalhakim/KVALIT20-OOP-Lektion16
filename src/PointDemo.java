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
    System.out.println("p1: (" + p1.x + " , " + p1.y + ")" );
    System.out.println("p2: (" + p2.x + " , " + p2.y + ")" );

    // Flytta punkt 1 (p1)
    p1.x = 5;   // Flytta 5 steg till höger
    p1.y = -5;  // Flytta 5 steg neråt

  }
}
