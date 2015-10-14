/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle.functions;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class RectangleFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Enter data for x and y 1-3
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the first x coordinate:");
      int x1 = sc.nextInt();
      System.out.println("Please enter the first y coordinate:");
      int y1 = sc.nextInt();
      System.out.println("Please enter the second x coordinate:");
      int x2 = sc.nextInt();
      System.out.println("Please enter the second y coordinate:");
      int y2 = sc.nextInt();
      // The point to test
      System.out.println("Please enter the x coordinate for the test point:");
      int x3 = sc.nextInt();
      System.out.println("Please enter the y coordinate for the test point:");
      int y3 = sc.nextInt();
      
      // Check if point is within rectangle
      boolean pointCheck = checkPoint(x1, y1, x2, y2, x3, y3);
      
      // Enter isRectangle data
      System.out.println("Please enter the first x coordinate:");
      int rectx1 = sc.nextInt();
      System.out.println("Please enter the first y coordinate:");
      int recty1 = sc.nextInt();
      System.out.println("Please enter the second x coordinate:");
      int rectx2 = sc.nextInt();
      System.out.println("Please enter the second y coordinate:");
      int recty2 = sc.nextInt();
      
      // Check if points represent a rectangle.
      boolean isRectangle = isRectangle(rectx1, recty1, rectx2, recty2);
      
      // Return data
      System.out.println("The point lies within the rectangle: " + pointCheck);
      System.out.println("The points provided form a valid rectangle: " + isRectangle);
    }
    
    public static boolean checkPoint(int x1, int y1, int x2, int y2, int x3, int y3){
      if (x3 > x1 && x3 < x2){
        if (y3 > y1 && y3 < y2){
          return true;
        } else {
          return false;
        }
      } else {
        return false;
      }
    }
    
    public static boolean isRectangle(int x1, int y1, int x2, int y2){
      int y = y1 - y1;
      int x = x2 - x1;
      int slope = y / x;
      if (slope == 0){
        return true;
      } else {
        return false;
      }
    }
}
