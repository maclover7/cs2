/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.functioninput;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class MathFunctionInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
      Scanner sc = new Scanner(System.in);
      System.out.println("Please input the first number");
      int num1 = sc.nextInt();
      System.out.println("Please input the second number");
      int num2 = sc.nextInt();
      System.out.println("What would you like to do with these two numbers? The options are: -, +, *, and /");
      String operation = sc.next();
      
      if (operation == "-"){
        int result = num1 - num2;
        System.out.println("The result of num1 - num2 is " + result + ".");
      } else if (operation == "+"){
          int result = num1 + num2;
          System.out.println("The result of num1 + num2 is " + result + ".");
      } else if (operation == "*"){
          int result = num1 * num2;
          System.out.println("The result of num1 * num2 is " + result + ".");
      } else if (operation == "/"){
          int result = num1 / num2;
          System.out.println("The result of num1 / num2 is " + result + ".");
      } else {
        System.out.println("Unrecognized operation.");
      }
    }
}
