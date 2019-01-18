/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author rahulsrinivas
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner rad = new Scanner(System.in);
        int radius = rad.nextInt();
        double circumference = Math.round((2 * Math.PI * radius)*100.0)/100.0 ;
        double area = Math.round((Math.PI * radius * radius)*100.0)/100.0;
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
        
    }
    
}
