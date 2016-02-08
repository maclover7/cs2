/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuber;

/**
 *
 * @author 18mossj
 */
public class Cuber {
    public int addCubes(int n) {
      int result = 0;
      
      for(int i = 0; i < n; i++) {
        if (i == 1) {
          result = i;
        } else {
          result = result + i^3;
        }
      }
      
      return result;
    }
}
