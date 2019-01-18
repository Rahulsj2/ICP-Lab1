/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.stringreverse;
import java.util.Scanner;

/**
 *
 * @author rahulsrinivas
 */
public class StringReverse {
    
    public static void main(String[] args){
        // Takes user input
        Scanner scanSentence = new Scanner(System.in);
        
        //reads sentence and assigns to variable
        String sentence = scanSentence.nextLine();
        
        //splits sentence into words into an array
        String[] sentenceParts = sentence.split(" ");
        String reverseWord = "";
        
        //loop picks each word in array
        for (int i = 0; i < sentenceParts.length; i++){
            // assigns word to a variable
            String word = sentenceParts[i];
            String newWord = "";
            
            // reverses word and assigns to variable
            for( int a = word.length() - 1; a >= 0; a--){
                newWord += word.charAt(a);    
            }
            
            // form sentence back with reversed words
            reverseWord += newWord + " ";
            
            
        }
        //prints reverse word sentence to console
        System.out.println(reverseWord);
    }
    
}
