/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalc;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Simplecalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter your first number:");
      String num1_string = sc.next();
      System.out.println("Please enter your second number:");
      String num2_string = sc.next();
      
      int num1 = Integer.parseInt(num1_string);
      int num2 = Integer.parseInt(num2_string);
      
      System.out.println("Please enter the operation to perform:");
      String operation = sc.next();
      
      int result = 0;
      
      if (operation == "+") {
        result = num1 + num2;
      } else if (operation == "-") {
        result = num1 - num2;
      } else if (operation == "*") {
        result = num1 * num2;
      } else if (operation == "/") {
        result = num1 / num2;
      } else if (operation == "%") {
        result = num1 % num2;
      }
      
      System.out.println("The result is " + result);
    }
}
