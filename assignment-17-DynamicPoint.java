/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinate.plane;
import coordinate.plane.Point;
import java.util.Random;

public class DynamicPoint {
  public int random_slope;
  public Point point1;
  public Point point2;
  
  public DynamicPoint(Point p1, Point p2){
    if (p1.x == p2.x) {
        
      if (p1.x > p2.x){
        point1 = p2;
        point2 = p1;
      } else {
        point1 = p1;
        point2 = p2;
      }
      
    } else {
      throw new IllegalArgumentException("The points do not form a vertical line segment");
    }
    Random rnd = new Random();
    int random_slope = rnd.nextInt();
  }
  
  public boolean checkSlopeIntersects(){
    int y = random_slope * point1.x;
    if (y > point1.y || y < point2.y ){
      return true;
    } else {
      return false;
    }
  }
}
