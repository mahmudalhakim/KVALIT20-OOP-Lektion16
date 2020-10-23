import java.util.Scanner;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-23
 * Time: 10:22
 * Project: Lektion16
 * Copyright: MIT
 */
public class CarDemo {
  public static void main(String[] args) {

    // Skapa några objekt (instanser)

    // 1. Skapa en referensvariabel
    Car car1;
    // 2. Skapa objektet (minnesutrymme) med nyckelordet new
    car1 = new Car();

    // Skriv ut en referensvariabel
    System.out.println(car1); // Car@23fc625e

    // Steg 1 och 2 i samma sats
    Car car2 = new Car();
    System.out.println(car2); // Car@3f99bd52

    // Arbeta med instansvariabler (egenskaper)
    car1.model = "Volvo";
    car1.year = 2020;
    car1.price = 350_000;

    car2.model = "Saab";
    car2.price = 250_000;

    System.out.println(car1.model + " kostar " + car1.price + "kr");
    System.out.printf("%s kostar %,d kr \n", car1.model , car1.price);

  }
}
