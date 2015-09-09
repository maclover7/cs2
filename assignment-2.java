/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannermath;
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
        // Read in five numbers
        System.out.println("Please input five numbers:");
        System.out.println("Number 1");
        int number1 = scanner.nextInt();
        System.out.println("Number 2");
        int number2 = scanner.nextInt();
        System.out.println("Number 3");
        int number3 = scanner.nextInt();
        System.out.println("Number 4");
        int number4 = scanner.nextInt();
        System.out.println("Number 5");
        int number5 = scanner.nextInt();
    }
    
}
