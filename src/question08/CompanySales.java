/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;
import java.util.Scanner;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class CompanySales {
    /**

     * @param args the command line arguments

     */
    private static int sales;
    public CompanySales(int sales) {

        this.sales = sales;

    }
    
    public static void analyzeSales()
    {
        if(sales<100000)
        {
            throw new IllegalArgumentException("We need to work hard and together to improve the sales above 100000 ");
        }
        else
        {
            System.out.println("The no. of car sales this year is "+sales+" which is very good");
        }
    }
    public static void main(String[] args) {

        // TODO code application logic here
        System.out.println("Question 8 by Ajay Kumar Reddy Arram"); 

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of cars sold this year: ");

        CompanySales sales = new CompanySales(sc.nextInt());

        try{

        sales.analyzeSales();

        }
        catch(IllegalArgumentException e)
        {
            System.out.println(" "+e);
        }
    }   
}

