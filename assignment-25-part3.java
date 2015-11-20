/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic3;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Arithmetic3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter angle Beta as a double");
      double angle = sc.nextDouble();
      System.out.println("Please enter side Z");
      int sidez = sc.nextInt();
      
      double tan = Math.tan(angle);
      // tan = sidez / sidey
      double sidex = tan * sidez;
      System.out.println("Side x is equal to " + sidex + ".");
      
      double remaining_angle = 90 - angle;
      System.out.println("The remaining angle is equal to " + remaining_angle + ".");
      
      double cos = Math.cos(angle);
      // cos = sidex / sidey
      double sidey = cos * sidex;
      System.out.println("Side y is equal to " + sidey + ".");
    }
}
