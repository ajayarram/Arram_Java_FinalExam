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
public class SumOfSeries {

    /**
     * @param args the command line arguments
     */
    
    
    public static int sumOfNumbersInSeries(int num) {
  
    if (num != 0) {
      return num + sumOfNumbersInSeries(num - 1);
    } else {
      return num;
    }
  }
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Question 10 by Ajay Kumar Reddy Arram"); 
    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number which will display the result of sum of series");
        int num=sc.nextInt();
        int sumOfAllNumbers = sumOfNumbersInSeries(num);
        System.out.println(sumOfAllNumbers);
    }
    
}
