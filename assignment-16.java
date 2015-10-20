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
  private String sound;
  
  public Clock(int inhours, int inminutes, int inseconds){
    hours = inhours;
    minutes = inminutes;
    seconds = inseconds;
  }
  
  // ALARM
  public String playAlarm(){
    return "Alarm is playing!";
  }
  
  // HOURS
  public int getHours(){
    return hours;
  }
  
  public void setHours(int h){
    hours = h;
  }
  
  // MILITARY
  public boolean isMilitary(){
    return isMilitary;
  }
  
  public void setMilitary(boolean m){
    isMilitary = m;
  }
  
  // MINUTES
  public int getMinutes(){
    return minutes;
  }
  
  public void setMinutes(int m){
    minutes = m;
  }
  
  // SECONDS
  public int getSeconds(){
    return seconds;
  }
  
  public void setSeconds(int s){
    seconds = s;
  }
  
  // SOUND
  public String getSound(){
    return sound;
  }
  
  public void setSound(String s){
    sound = s;
  }
}
