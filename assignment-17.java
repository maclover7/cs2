/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinate.plane;
import java.util.Scanner;

/**
 *
 * @author 18mossj
 */
public class CoordinatePlane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Input Point #1's x coordinate:");
      int x1 = sc.nextInt();
      System.out.println("Input Point #1's y coordinate:");
      int y1 = sc.nextInt();
      System.out.println("Input Point #2's x coordinate:");
      int x2 = sc.nextInt();
      System.out.println("Input Point #2's y coordinate:");
      int y2 = sc.nextInt();
      
      Point p1 = new Point(x1, y1);
      Point p2 = new Point(x2, y2);
      DynamicPoint dp = new DynamicPoint(p1, p2);
    }
}

public class DynamicPoint {
  public Point point1;
  public Point point2;
  
  public DynamicPoint(Point p1, Point p2){
    if (p1.x == p2.x) {
      point1 = p1;
      point2 = p2;
    } else {
      throw new IllegalArgumentException("The points do not form a vertical line segment");
    }
  }
}

public class Point {
  public int x;
  public int y;
  
  public Point(int xcoord, int ycoord){
    x = xcoord;
    y = ycoord;
  }
}
