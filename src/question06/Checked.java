/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */

class Checked{
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Question 6 by Ajay Kumar Reddy Arram"); 
        Scanner sc = new Scanner(new File("file.txt"));
        String str;
       while(sc.hasNext())
       {
           str=sc.nextLine();
           System.out.println("the fact is :"+str);
       }        
        sc.close();
    }
       
}
