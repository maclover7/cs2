/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic2;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author 18mossj
 */
public class Arithmetic2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the first side of the right triangle:");
      int side1 = sc.nextInt();
      System.out.println("Please enter the second side of the right triangle:");
      int side2 = sc.nextInt();
      int sides = (side1 * side1) * (side2 * side2);
      int pyth = (int) Math.sqrt(sides);
      System.out.println(side1 + " & " + side2 + " yields " + pyth);
    }
}
