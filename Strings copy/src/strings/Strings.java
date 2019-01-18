/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strings;
import java.util.Scanner;

/**
 *
 * @author rahulsrinivas
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    
    
   
    public static void main(String[] args) {
      
       //Takes input from user 
       Scanner newInput = new Scanner(System.in);
       
       // reads user input and assign to variable
       String input = newInput.nextLine();
       
       // assigns length of word to variable
       int strLength = input.length();
       
       // prints word length in console
       System.out.println(strLength);
    }
    
}
