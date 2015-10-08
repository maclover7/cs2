/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date.functions;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class DateFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // Normal --> Julian
      System.out.println("Please enter the month (01 for January, 10 for October):");
      int month = sc.nextInt() - 1;
      System.out.println("Please enter the date (01 for the 1st, 10 for the 10th):");
      int date = sc.nextInt();
      System.out.println("Please enter the year:");
      int year = sc.nextInt();
      int julian_date = dateToJulian(month, date, year);
      System.out.println("The julian date is " + julian_date + ".\n");
      // Julian --> Normal
      String regular_date = julianToDate(1);
      System.out.println("The regular date is " + regular_date + ".\n");
      // # of days between 2 dates
      // input first date
      System.out.println("Enter the information for the first date:");
      System.out.println("Please enter the month (01 for January, 10 for October):");
      int month1 = sc.nextInt() - 1;
      System.out.println("Please enter the date (01 for the 1st, 10 for the 10th):");
      int date1 = sc.nextInt();
      System.out.println("Please enter the year:");
      int year1 = sc.nextInt();
      // input second date
      System.out.println("Enter the information for the second date:");
      System.out.println("Please enter the month (01 for January, 10 for October):");
      int month2 = sc.nextInt() - 1;
      System.out.println("Please enter the date (01 for the 1st, 10 for the 10th):");
      int date2 = sc.nextInt();
      System.out.println("Please enter the year:");
      int year2 = sc.nextInt();
      int days_between = daysBetween(month1, date1, year1, month2, date2, year2);
      System.out.println("The days between the two dates is " + days_between + ".\n");
    }

    public static int dateToJulian(int month, int date, int year){
      Calendar c1 = GregorianCalendar.getInstance();
      c1.set(year, month, date);
      int day_of_year = c1.get(Calendar.DAY_OF_YEAR);
      return year + day_of_year;
    }
    
    public static String julianToDate(int julianDate){
      Calendar c1 = Calendar.getInstance();
      int date = c1.get(Calendar.DATE);
      int month = c1.get(Calendar.MONTH);
      int year = c1.get(Calendar.YEAR);
      
      String str_date = Integer.toString(date);
      String str_month = Integer.toString(month);
      String str_year = Integer.toString(year);
      return str_date + str_month + str_year;
    }
    
    public static int daysBetween(int month1, int date1, int year1, int month2, int date2, int year2){
      Calendar c1 = GregorianCalendar.getInstance();
      c1.set(year1, month1, date1);
      int day_of_year1 = c1.get(Calendar.DAY_OF_YEAR);
      Calendar c2 = GregorianCalendar.getInstance();
      c2.set(year2, month2, date2);
      int day_of_year2 = c2.get(Calendar.DAY_OF_YEAR);
      if (day_of_year1 < day_of_year2){
        int difference = day_of_year1 - day_of_year2;
        int result = (difference < 0 ? -difference : difference);
        return result;
      } else {
        int difference = day_of_year1 - day_of_year2;
        int result = (difference < 0 ? -difference : difference);
        return result;
      }
    }
}
