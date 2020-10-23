/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-23
 * Time: 11:38
 * Project: Lektion16
 * Copyright: MIT
 * <p>
 * Point är en klass som beskriver
 * en punkt i 2D koordinatsystem.
 */
public class Point {

  // Instansvariabler
  double x;  // x-koordinat
  double y;  // y-koordinat


  /**
   * En klassmetod som beräknar avståndet mellan två punkter
   *
   * @param p1 är en referensvariabel till den första punkten
   * @param p2 är en referensvariabel till den andra punkten
   * @return avståndet mellan punkterna
   */
  public static double distance(Point p1, Point p2) {

    /*
    // YAGNI
    double x1 = p1.x;
    double x2 = p2.x;
    double y1 = p1.y;
    double y2 = p2.y;
     */

    // Beräkna avståndet
    return Math.sqrt(Math.pow(p2.x - p1.x, 2) + (p2.y - p1.y) * (p2.y - p1.y));
  }

}
