/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialcalc;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Factorialcalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter a number n:");
      int n = sc.nextInt() + 1;
      
      int result = 0;
      
      for(int i = 0; i < n; i++) {
        if (i == 1) {
          result = i;
        } else {
          result = result * i;
        }
      }
      
      System.out.println("The result is equal to " + result);
    }
}
