/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice2;
import java.lang.Math;
/**
 *
 * @author 18mossj
 */
public class Practice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      findSqrtRoots();
      millionaire();
    }
    
    public static void findSqrtRoots() {
      int[] input = new int[5];
      input[0] = 25;
      input[1] = 20;
      input[2] = 15;
      input[3] = 10;
      input[4] = 5;
      
      for(int i = 0; i < input.length; i++) {
        double root = Math.sqrt(input[i]);
        System.out.println("The square root for " + input[i] + " is equal to " + root);
      }
    }
    
    public static void millionaire() {
        int counter = 0;
        int result = 0;
      
      while(result != 1000000) {
        result += counter;
        counter++;
      }
      
      System.out.println("The value of n would be " + counter);
    }
    
}
