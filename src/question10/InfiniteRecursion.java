/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;
import java.util.Scanner;
/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class InfiniteRecursion {

    /**
     * @param args the command line arguments
     */
    
   public static int sumOfNum(int num) 
{ 
    if(num == 1) 
    { 
        return 1; 
    } 
    else 
    { 
        return num + sumOfNum(num); 
    } 
} 
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 10 by Ajay Kumar Reddy Arram"); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number other than 1 which should display the "
                + "result of sum of series");
        int num=sc.nextInt();
        
        System.out.println("The sum of numbers of given inetger is "+ sumOfNum(num));
        
    }
    
}
