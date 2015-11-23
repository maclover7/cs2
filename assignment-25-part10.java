/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic10;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Arithmetic10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter an amount of dog years:");
      int dog_years = sc.nextInt();
      int human_years = 0;
      if (dog_years > 1) {
        human_years += 13;
        human_years += ((dog_years - 1) * (16/3));
      } else {
        human_years = 13;
      }
      
      System.out.println(dog_years + " dog years is equal to " + human_years + " human years.");
    }
}
