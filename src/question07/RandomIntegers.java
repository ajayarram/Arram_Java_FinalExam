/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */

import java.util.Scanner;
public class RandomIntegers {

 

    /**
     * @param args the command line arguments
     */
    
    public static void randomIntegers(int pos){
        int array[] = new int[100];
        for(int i=0;i<100;i++)
        {
            array[i]=(int)Math.floor(Math.random()*100);
        }      
        if(pos>=0 && pos<100)
        {
            System.out.print("The value at the entered index position "+pos+" is ");
            System.out.println(array[pos]);
            
        }
        else
        {
            System.out.println("Out Of Bounds.");
        }
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 7 by Ajay Kumar Reddy Arram"); 
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the index of an array");
        randomIntegers(scan.nextInt());
    }
    
}
