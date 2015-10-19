/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.work;

/**
 *
 * @author 18mossj
 */
public class Point {
  private int x;
  private int y;

  public Point(int a, int b){
    x = a;
    y = b;
  }
  
  public int getX(){
    return x;
  }
  
  public int getY(){
    return y;
  }
  
  public void setX(int a){
    x = a;
  }
  
  public void setY(int b){
    y = b;
  }
}
