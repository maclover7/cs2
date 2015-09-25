/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exact.age.checker;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
/**
 *
 * @author 18mossj
 */
public class ExactAgeChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Get data in from user
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter your birth month (ex: 01 for January):");
      int person_month = sc.nextInt();
      System.out.println("Please enter your birth date (ex: 01 for the 1st of the month):");
      int person_date = sc.nextInt();
      System.out.println("Please enter your birth year:");
      int person_year = sc.nextInt();
      
      // Get variables from Calendar
      Calendar calendar = Calendar.getInstance();
      int current_month = calendar.get(Calendar.MONTH);
      int current_year = calendar.get(Calendar.YEAR);
      int current_date = calendar.get(Calendar.DATE);
      int current_days = calendar.get(Calendar.DAY_OF_YEAR);

      // Get age in years
      int age_in_years = current_year - person_year;

      // LOGIC
      if ( person_month >= current_month && person_date >= current_date ) {
          try {
              // you have reached your birthday
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date d = sdf.parse(person_date + "/" + person_month + "/" + person_year);
            Calendar inputted_data = Calendar.getInstance();
            inputted_data.setTime(d);
            int age_in_days = current_days - inputted_data.get(Calendar.DAY_OF_YEAR);
            System.out.println("You are " + age_in_years + " years, and " + age_in_days + " days old.");
          }
          catch(java.text.ParseException e){
	    e.printStackTrace();
	  }
      } else {
          try {
            age_in_years--;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date d = sdf.parse(person_date + "/" + person_month + "/" + person_year);
            Calendar inputted_data = Calendar.getInstance();
            inputted_data.setTime(d);
            int age_in_days = inputted_data.get(Calendar.DAY_OF_YEAR);
            System.out.println("You are " + age_in_years + " years, and " + age_in_days + " days old.");
          }
          catch(java.text.ParseException e){
	    e.printStackTrace();
	  }
      }
    }
}
