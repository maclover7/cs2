/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryfine;
import java.util.Scanner;
import java.math.BigDecimal;
/**
 *
 * @author 18mossj
 */
public class LibraryFine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Initialize Scanner class
      Scanner scanner = new Scanner(System.in);
      
      // Read in name
      System.out.println("Please input your first name:");
      String first_name = scanner.next();
      System.out.println("Please input your middle name:");
      String middle_name = scanner.next();
      System.out.println("Please input your last name:");
      String last_name = scanner.next();
      
      // Initialize Array
      double[] inputArray = new double[20];
      
      // Read in the fines
      System.out.println("Enter the Fine for the First Book:");
      inputArray[0] = scanner.nextDouble();
      System.out.println("Enter the Fine for the Second Book:");
      inputArray[1] = scanner.nextDouble();
      System.out.println("Enter the Fine for the Third Book:");
      inputArray[2] = scanner.nextDouble();
      System.out.println("Enter the Fine for the Fourth Book:");
      inputArray[3] = scanner.nextDouble();
      System.out.println("Enter the Fine for the Fifth Book:");
      inputArray[4] = scanner.nextDouble();
      System.out.println("Enter the Fine for the Sixth Book:");
      inputArray[5] = scanner.nextDouble();
      System.out.println("Enter the Fine for the Seventh Book:");
      inputArray[6] = scanner.nextDouble();
      System.out.println("Enter the Fine for the Eighth Book:");
      inputArray[7] = scanner.nextDouble();
      System.out.println("Enter the Fine for the Ninth Book:");
      inputArray[8] = scanner.nextDouble();
      System.out.println("Enter the Fine for the Tenth Book:");
      inputArray[9] = scanner.nextDouble();
      
      // Print out sum of the fines
      String name = first_name + " " + middle_name + " " + last_name + ", your total fine is";
      double sum_of_fines_1 = inputArray[0] + inputArray[1] + inputArray[2] + inputArray[3] + inputArray[4] + inputArray[5];
      double sum_of_fines_2 = inputArray[6] + inputArray[7] + inputArray[8] + inputArray[9];
      double fines = sum_of_fines_1 + sum_of_fines_2;
      System.out.println(name + " " + "$" + fines + ".");
      
      // Find the largest and smallest fines
      double smallest_number = inputArray[0];
      double largest_number = inputArray[0];
      for(int i=1; i < inputArray.length; i++){
        if(inputArray[i] > largest_number)
          largest_number = inputArray[i];
        else if (inputArray[i] < smallest_number)
          smallest_number = inputArray[i];
      }
      
      // Print largest and smallest fines
      System.out.println("Your largest fine is " + "$" + largest_number + ".");
      System.out.println("Your smallest fine is " + "$" + smallest_number + ".");
    }
}
