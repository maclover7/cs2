/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.analysis;
import java.lang.System;
/**
 *
 * @author 18mossj
 */
public class StringAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String string = "Apple123";
      
      // Count the number of letters in the string
      int number_of_letters = 0;
      for (int i = 0; i < string.length(); i++) {
        if (Character.isLetter(string.charAt(i)))
          number_of_letters++;
      }
      
      // Check if first character is a vowel
      String first_character = Character.toString(string.charAt(0));
      boolean first_character_vowel = false;
      if (first_character == "a" || first_character == "e" || first_character == "i" || first_character == "o" || first_character == "u"){
        first_character_vowel = true;
      }
      
      // Count the number of uppercase letters in the string
      int number_of_uppercase_letters = 0;
      for (int i = 0; i < string.length(); i++) {
        if (Character.isUpperCase(string.charAt(i)))
          number_of_uppercase_letters++;
      }
      
      // Count the number of numbers in the string
      int number_of_numbers = 0;
      for (int i = 0; i < string.length(); i++) {
        if (Character.isDigit(string.charAt(i)))
          number_of_numbers++;
      }
      
      // Output numbers
      System.out.println("For the string " + string + "...");
      System.out.println("It has " + number_of_letters + " letters.");
      if (first_character_vowel == true) {
        System.out.println("It does start with a vowel.");
      } else{
        System.out.println("It does not start with a vowel.");
      }
      System.out.println("It has " + number_of_uppercase_letters + " uppercase letters.");
      System.out.println("It has " + number_of_numbers + " numbers.");
    }  
}
