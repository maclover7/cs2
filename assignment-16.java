// FILE #1
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm.clock;

/**
 *
 * @author 18mossj
 */
public class AlarmClock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Clock a = new Clock(6, 30, 0);
      System.out.println("The clock will go off at: " + a.getHours() + " hours.");
      System.out.println("The clock will go off at: " + a.getMinutes() + " minutes.");
      System.out.println("The clock will go off at: " + a.getSeconds() + " seconds.");
    }
}

// FILE #2
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm.clock;

/**
 *
 * @author 18mossj
 */
public class Clock {
  private boolean isMilitary;
  private int hours;
  private int minutes;
  private int seconds;
  
  public Clock(int inhours, int inminutes, int inseconds){
    hours = inhours;
    minutes = inminutes;
    seconds = inseconds;
  }
  
  public int getHours(){
    return hours;
  }
  
  public int getMinutes(){
    return minutes;
  }
  
  public int getSeconds(){
    return seconds;
  }
  
  public static void setMilitary(boolean military){
    boolean isMilitary = military;
  }
}
