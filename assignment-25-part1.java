/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic1;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Arithmetic1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a double:");
      double double_input1 = sc.nextDouble();
      System.out.println("Please enter an integer:");
      int int_input1 = sc.nextInt();
      calcDoubleValues1AndPrint(double_input1);
      calcIntValues1AndPrint(int_input1);
      
      System.out.println("Please enter another double:");
      double double_input2 = sc.nextDouble();
      System.out.println("Please enter another integer:");
      int int_input2 = sc.nextInt();
      calcValues2(double_input1, double_input2, int_input1, int_input2);
    }
    
    public static void calcDoubleValues1AndPrint(double input) {
      double square_root = Math.sqrt(input);
      System.out.println("The square root of " + input + " is " + square_root);
      double power = Math.pow(input, input);
      System.out.println("The power of " + input + " is " + power);
      double abs = Math.abs(input);
      System.out.println("The absolute value of " + input + " is " + abs);
      double input_mod = input % 2;
      if (input_mod == 0.0) {
        System.out.println(input + " is even.");
      } else {
        System.out.println(input + " is odd.");
      }
      double squared = input * input;
      System.out.println(input + " squared is is " + squared);
    }
    
    public static void calcIntValues1AndPrint(int input) {
      int square_root = (int) Math.sqrt(input);
      System.out.println("The square root of " + input + " is " + square_root);
      int power = (int) Math.pow(input, input);
      System.out.println("The power of " + input + " is " + power);
      int abs = Math.abs(input);
      System.out.println("The absolute value of " + input + " is " + abs);
      int input_mod = input % 2;
      if (input_mod == 0.0) {
        System.out.println(input + " is even.");
      } else {
        System.out.println(input + " is odd.");
      }
      int squared = input * input;
      System.out.println(input + " squared is is " + squared);
    }
    
    public static void calcValues2(double double_input1, double double_input2, int int_input1, int int_input2) {
      if (double_input1 > double_input2){
        System.out.println(double_input1 + " is bigger than " + double_input2);
      } else {
        System.out.println(double_input2 + " is bigger than " + double_input1);
      }
      
      // sum
      double double_sum = double_input1 + double_input2;
      System.out.println("The sum of " + double_input1 + " and " + double_input2 + " is " + double_sum + ".");
      int int_sum = int_input1 + int_input2;
      System.out.println("The sum of " + int_input1 + " and " + int_input2 + " is " + int_sum + ".");
      
      // product
      double double_product = double_input1 * double_input2;
      System.out.println("The product of " + double_input1 + " and " + double_input2 + " is " + double_product + ".");
      int int_product = int_input1 * int_input2;
      System.out.println("The product of " + int_input1 + " and " + int_input2 + " is " + int_product + ".");
      
      // difference
      double double_difference = double_input1 - double_input2;
      System.out.println("The difference of " + double_input1 + " and " + double_input2 + " is " + double_difference + ".");
      int int_difference = int_input1 - int_input2;
      System.out.println("The difference of " + int_input1 + " and " + int_input2 + " is " + int_difference + ".");
      
      // quotient
      double double_quotient = double_input1 - double_input2;
      System.out.println("The quotient of " + double_input1 + " and " + double_input2 + " is " + double_quotient + ".");
      int int_quotient = int_input1 - int_input2;
      System.out.println("The quotient of " + int_input1 + " and " + int_input2 + " is " + int_quotient + ".");
    }
}
