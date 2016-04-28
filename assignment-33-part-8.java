/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccinum;
import java.util.Scanner;

/**
 *
 * @author 18mossj
 */
public class FibonacciNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("For what number would you like to calculate the fibonacci number:");
      int n = sc.nextInt();
     
      
      // Calculate Fibonacci Number
      int num1 = 0;
      int num2 = 0;
      int total = 0;
      for(int i = 0; i < n; i++) {
        System.out.println("i: " + fibFor(i));
      }
    }
    
    public static long fibFor(int n) {
      if (n <= 1) {
        return n;
      } else {
        return fibFor(n-1) + fibFor(n-2);
      }
    }
}
