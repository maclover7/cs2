/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reciprocalsquares;
import java.util.Scanner;

/**
 *
 * @author 18mossj
 */
public class Reciprocalsquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Please enter a number N");
      int n = sc.nextInt();
      
      int total = 0;
      
      for(int i = 1; i < n; i++) {
        total += ((n/i) * (n/i));
        
        if (i == 100) {
          break;
        }
        
        if (total == 0.000001) {
          break;
        }
      }
      
      System.out.println("The total is " + total);
    }
}
