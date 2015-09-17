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
      Scanner console = new Scanner(System.in);
      System.out.println("Please enter your first name:");
      String first_name = console.next();
      Calendar now = Calendar.getInstance();
      System.out.println("Current Year is: " + now.get(Calendar.YEAR));
    }
    
}
