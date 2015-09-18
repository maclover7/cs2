/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minorchecker;
import java.util.Calendar;
import java.util.Scanner;
import java.lang.System;
/**
 *
 * @author 18mossj
 */
public class MinorChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get input from user
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter your first name:");
      String first_name = sc.next();
      System.out.println("Please enter your birth month:");
      String person_month = sc.next();
      System.out.println("Please enter your birth year:");
      String person_year = sc.next();
      
      // Create instance of calendar and get current values
      Calendar now = Calendar.getInstance();
      int current_month = now.get(Calendar.MONTH);
      int current_year = now.get(Calendar.YEAR);
      
      // Get difference between current year and person's birth year
      int difference = current_year - Integer.parseInt(person_year);
      
      // Check to make sure difference between current_year and person_year is AT LEAST 18
      // And check to make sure the person_month is less than or equal to current_month (LESS means it passed already)
      if ( difference >= 18 && Integer.parseInt(person_month) <= current_month ) {
          System.out.println(first_name + ", you ARE over 18 years old.");
      } else {
          System.out.println(first_name + ", you ARE NOT over 18 years old.");
      }
    }
    
}
