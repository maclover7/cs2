/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic9;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Arithmetic9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter your weight (in pounds)");
      int weight_pounds = sc.nextInt();
      System.out.println("Please enter your height (in inches)");
      int height_inches = sc.nextInt();
      // Conversions
      int weight_kg = (int) (weight_pounds * 0.454);
      int height_meters = (int) (height_inches * 0.0254);
      // Calculate BMI
      int bmi = weight_kg / (height_meters * height_meters);
      System.out.println("Your BMI is equal to" + bmi + ".");
    }
}
