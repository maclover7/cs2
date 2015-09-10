/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannermath;
  import java.lang.Math;
  import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class ScannerMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize Scanner class
        Scanner scanner = new Scanner(System.in);
        // Initialize Array
        int[] inputArray = new int[5];
        // Read in five numbers
        System.out.println("Please input five numbers:");
        System.out.println("Number 1:");
        inputArray[0] = scanner.nextInt();
        System.out.println("Number 2:");
        inputArray[1] = scanner.nextInt();
        System.out.println("Number 3:");
        inputArray[2] = scanner.nextInt();
        System.out.println("Number 4:");
        inputArray[3] = scanner.nextInt();
        System.out.println("Number 5:");
        inputArray[4] = scanner.nextInt(); 
        // Find largest and smallest numbers in the array
        int smallest_number = inputArray[0];
        int largest_number = inputArray[0];
        for(int i=1; i < inputArray.length; i++)
        {
          if(inputArray[i] > largest_number)
            largest_number = inputArray[i];
          else if (inputArray[i] < smallest_number)
            smallest_number = inputArray[i];
        }
        // Find the average number
        int sum = inputArray[0] + inputArray[1] + inputArray[2] + inputArray[3] + inputArray[4];
        int average_number = sum / inputArray.length;
        // Find the square root of the sum of the array
        double double_typed_sum = sum;
        double square_root = Math.sqrt(double_typed_sum);
        // Print the results
        System.out.println("The largest number is " + largest_number);
        System.out.println("The smallest number is " + smallest_number);
        System.out.println("The average of the five numbers is " + average_number);
        System.out.println("The square root of the sum of the five numbers is " + square_root);
    }
    
}
