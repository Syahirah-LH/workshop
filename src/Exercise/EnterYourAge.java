/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

import javax.swing.*;

public class EnterYourAge {
    public static void main(String[] args){
        String a1;
        int age1 = 0;
        int birthYear = 0;
        int year = 2019;
        a1 = JOptionPane.showInputDialog("Enter your birth year:");
        try
      {  
          birthYear = Integer.parseInt(a1);
      }
      catch(NumberFormatException n)
      {
         JOptionPane.showMessageDialog(null, "You must enter your birth year (number)","InputDataError",
         JOptionPane.ERROR_MESSAGE);
         System.exit(1);
      } 
       catch(NullPointerException n)
      {
        JOptionPane.showMessageDialog(null, "You Pressed the Cancel Button", "Program Termination",
        JOptionPane.ERROR_MESSAGE);
        System.exit(1);
      }
      
      age1 = year - birthYear;  
      JOptionPane.showMessageDialog(null, "Your age is " + age1);
      
      System.exit(0); 
      
   } 
}

