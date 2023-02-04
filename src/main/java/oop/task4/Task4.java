
package oop.task4;

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        double r,result;
        System.out.print("Enter radius : ");
        r =  input.nextDouble();
        
        result = Math.PI*r*r;
        System.out.println("area of Circle =  "+String.format("%.2f", result));
        
        
        
        
        
        
    }
}
