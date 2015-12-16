/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author 18mossj
 */
public class Holidays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a year:");
      int year = sc.nextInt();
      
      // Labor Day
      System.out.println("In " + year + ", Labor Day takes place on " + calcLaborDay(year));
      
      // Memorial Day
      System.out.println("In " + year + ", Memorial Day takes place on " + calcMemorialDay(year));
      
      // Thanksgiving Day
      System.out.println("In " + year + ", Thanksgiving Day takes place on " + calcThanksgiving(year));
      
      // Election Day
      System.out.println("In " + year + ", Election Day takes place on " + "");
    }
    
    public static Date calcLaborDay(int nYear) {
      int month = 8; // September
      Date date = new Date(nYear, 9, 1);
      int num = date.getDay();
      switch(num) {
        case 0 : // Sunday
          return new Date(nYear, month, 2);
        case 1 : // Monday
          return new Date(nYear, month, 7);
        case 2 : // Tuesday
          return new Date(nYear, month, 6);
        case 3 : // Wednesday
          return new Date(nYear, month, 5);
        case 4 : // Thursday
          return new Date(nYear, month, 4);
        case 5 : // Friday
          return new Date(nYear, month, 3);
        default : // Saturday
          return new Date(nYear, month, 2);
      }
    }
    
    public static Date calcMemorialDay(int nYear) {
      int nMonth = 4; //May
      Date dtD = new Date(nYear, 4, 31);
      int num = dtD.getDay();
      switch(num) {
        case 0 : // Sunday
          return new Date(nYear, nMonth, 25);
        case 1 : // Monday
          return new Date(nYear, nMonth, 31);
        case 2 : // Tuesday
          return new Date(nYear, nMonth, 30);
        case 3 : // Wednesday
          return new Date(nYear, nMonth, 29);
        case 4 : // Thursday
          return new Date(nYear, nMonth, 28);
        case 5 : // Friday
          return new Date(nYear, nMonth, 27);
        default : // Saturday
          return new Date(nYear, nMonth, 26);
      }
    }
    
    public static Date calcThanksgiving(int nYear) {
      int month = 10; // November
      Date date = new Date(nYear, 10, 1);
      int num = date.getDay();
      switch(num) {
        case Calendar.SUNDAY :
          return new Date(nYear, month, 26);
        case Calendar.MONDAY :
          return new Date(nYear, month, 25);
        case Calendar.TUESDAY :
          return new Date(nYear, month, 24);
        case Calendar.WEDNESDAY :
          return new Date(nYear, month, 23);
        case Calendar.THURSDAY :
          return new Date(nYear, month, 22);
        case Calendar.FRIDAY :
          return new Date(nYear, month, 28);
        default : // Saturday
          return new Date(nYear, month, 27);
      }
    }
}

/*
Memorial Day (last Monday in may)
Election Day (first Tuesday after the first Monday in November).
*/
