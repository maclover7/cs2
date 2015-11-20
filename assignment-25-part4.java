/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic4;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Arithmetic4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the radius for the circle:");
      int radius = sc.nextInt();
      //calculate circumference
      double circumference = 2 * radius * Math.PI;
      System.out.println("For a radius of " + radius + ", the circumference is " + circumference + ".");
      // calculate diameter
      double diameter = radius * 2;
      System.out.println("For a radius of " + radius + ", the diameter is " + diameter + ".");
      // calculate area
      double area = Math.PI * (radius * radius);
      System.out.println("For a radius of " + radius + ", the area is " + area + ".");
    }
}
