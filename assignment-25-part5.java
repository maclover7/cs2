/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic5;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Arithmetic5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a farenheit value to convert to celsius:");
      int farenheit = sc.nextInt();
      int celsius = ((farenheit - 32) * 5) / 9;
      System.out.println(farenheit + " in celsius is equal to " + celsius + ".");
    }
    
}
