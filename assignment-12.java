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
      System.out.println("Please enter the month (01 for January, 10 for October):");
      int month = sc.nextInt() - 1;
      System.out.println("Please enter the date (01 for the 1st, 10 for the 10th):");
      int date = sc.nextInt();
      System.out.println("Please enter the year:");
      int year = sc.nextInt();
      int julian_date = dateToJulian(month, date, year);
      System.out.println("The julian date is " + julian_date + ".");
      
      String regular_date = julianToDate(1);
      System.out.println("The regular date is " + regular_date + ".");
    }

    public static int dateToJulian(int month, int date, int year){
      Calendar c1 = GregorianCalendar.getInstance();
      c1.set(year, month, date);  //January 30th 2000
      Date sDate = c1.getTime();
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
}
