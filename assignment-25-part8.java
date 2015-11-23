/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic8;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Arithmetic8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the initial population:");
      int initial = sc.nextInt();
      System.out.println("Please enter the first week population:");
      int first_week = sc.nextInt();
      double rate = first_week / initial;
      System.out.println("The population growth rate is " + rate + ".");
      int second_week = (int) (first_week * rate);
      System.out.println("The second week population would equal " + second_week + ".");
    }
}
