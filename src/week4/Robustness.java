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
//Find the average for three numbers ,

import javax.swing.*;

public class Robustness {
   public static void main(String[] args)
   {
      String s1;
      String s2;
      double num1 = 0;
      double num2 = 0;
      double average = 0;
      s1 = JOptionPane.showInputDialog("Enter a number:");
      s2 = JOptionPane.showInputDialog("Great! Now enter another number:");
       try
      {  num1 = Double.parseDouble(s1);
         num2 = Double.parseDouble(s2);
      }
      catch(NumberFormatException n)
      {
         JOptionPane.showMessageDialog(null, "You must enter a number","InputDataError",                                     JOptionPane.ERROR_MESSAGE);
         System.exit(1);
      }
       catch(NullPointerException n)
      {
        JOptionPane.showMessageDialog(null, "You Pressed the Cancel Button", "Program Termination",
                                             JOptionPane.ERROR_MESSAGE);
        System.exit(1);
      }
      
      average = (num1 + num2) / 2.0;
      JOptionPane.showMessageDialog(null,
     
"The average of " + num1 + " and " + num2 + " is " + average,
          "QuickTest Program 4.5", JOptionPane.INFORMATION_MESSAGE);
      
      System.exit(0); 
   } 
}

