/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;
import java.util.Scanner;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class Unchecked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 6 by Ajay Kumar Reddy Arram"); 
        
        String[] bikes = {"honda", "hero", "suzuki", "Mazda" , "pulsar","FZ"};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the index position to find the bike name in the array ");
        int index=sc.nextInt();
        try {
         
            System.out.println("The element at the index is "+bikes[index]);
        }
         catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("The index entered should be less than index 6."
                    + " We have only 6 bikes in the list "+ex);
                    
        }
        
        }
        
       
    }
    
    

