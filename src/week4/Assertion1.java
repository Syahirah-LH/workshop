/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author MIIT
 */
public class Assertion1 {

   public static void main(String[] args) {
      int number = -5;    // assumed number is not negative
      // This assert also serve as documentation
      assert (number >= 0) : "number is negative: " + number;
      // do something
      System.out.println("The number is " + number);
   }

}

