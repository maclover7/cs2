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
      int nMonth = 0; // January
      Date d = new Date(year, nMonth, 1);
      String labor_day = "";
      System.out.println("In " + year + ", Labor Day takes place on " + calcLaborDay(year));
      
      // Memorial Day
      String memorial_day = "";
      System.out.println("In " + year + ", Memorial Day takes place on " + memorial_day);
      
      // Thanksgiving Day
      System.out.println("In " + year + ", Thanksgiving Day takes place on " + calcThanksgiving(year));
      
      // Election Day
      String election_day = "";
      System.out.println("In " + year + ", Election Day takes place on " + election_day);
    }
    
    public static Date calcLaborDay(int nYear) {
      Calendar cal = new GregorianCalendar(nYear, Calendar.NOVEMBER, 1);
      switch(cal.get(Calendar.DAY_OF_WEEK)) {
        case Calendar.TUESDAY :
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 7)).getTime();
        //
        case Calendar.SUNDAY :
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 26)).getTime();
        case Calendar.MONDAY :
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 25)).getTime();
        
        case Calendar.WEDNESDAY :
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 23)).getTime();
        case Calendar.THURSDAY :
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 22)).getTime();
        case Calendar.FRIDAY :
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 28)).getTime();
        default : // Saturday
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 27)).getTime();
      }
    }
    
    public static Date calcThanksgiving(int nYear) {
      Calendar cal = new GregorianCalendar(nYear, Calendar.NOVEMBER, 1);
      switch(cal.get(Calendar.DAY_OF_WEEK)) {
        case Calendar.SUNDAY :
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 26)).getTime();
        case Calendar.MONDAY :
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 25)).getTime();
        case Calendar.TUESDAY :
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 24)).getTime();
        case Calendar.WEDNESDAY :
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 23)).getTime();
        case Calendar.THURSDAY :
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 22)).getTime();
        case Calendar.FRIDAY :
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 28)).getTime();
        default : // Saturday
          return (new GregorianCalendar(nYear, Calendar.NOVEMBER, 27)).getTime();
      }
    }
}

/*
Labor Day (first Monday in september)
Memorial Day (last Monday in may)
[x] Thanksgiving (4th Thursday in November) 
Election Day (first Tuesday after the first Monday in November).

You can leverage the functions and definitions from the weekday.java (days in the week) program. 
The program needs to prompt the user for a desired year, then calculate and display the holiday names and their respective dates.
*/
