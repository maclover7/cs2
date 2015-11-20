/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic7;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Arithmetic7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the length of the yard:");
      int yard_length = sc.nextInt();
      System.out.println("Please enter the width of the yard:");
      int yard_width = sc.nextInt();
      System.out.println("Please enter the length of the house:");
      int house_length = sc.nextInt();
      System.out.println("Please enter the width of the house:");
      int house_width = sc.nextInt();
      
      int house_area = house_length * house_width;
      int yard_area = yard_length * yard_width;
      int area_to_mow = yard_area - house_area;
      int time = (area_to_mow / 2) / 60;
      System.out.println("It will take you " +  time + " minutes to mow the yard");
    }
}
