/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anti.scanner;
  import java.lang.Math;
  import java.lang.System;
  import java.io.BufferedReader;
  import java.io.BufferedWriter;
  import java.io.InputStreamReader;
  import java.io.OutputStreamWriter;
  import java.io.IOException;
  
/**
 *
 * @author 18mossj
 */
public class AntiScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
          BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
          BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
         
          log.write("Please enter your name:\n");
          log.flush();
	  String player_name = bufferRead.readLine();
          
          log.write("Please enter your first golf score:\n");
          log.flush();
          int score1 = Integer.parseInt(bufferRead.readLine());
          
          log.write("Please enter your second golf score:\n");
          log.flush();
          int score2 = Integer.parseInt(bufferRead.readLine());
          
          log.write("Please enter your third golf score:\n");
          log.flush();
          int score3 = Integer.parseInt(bufferRead.readLine());
          
          int sum = score1 + score2 + score3;
          int average_score = sum / 3;
          
          log.write("Nice job, " + player_name + "! Your average score is " + average_score + "\n");
          log.flush();
          
	}
	catch(IOException e)
	{
	  e.printStackTrace();
	}
    } 
}
