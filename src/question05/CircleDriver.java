/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 5 by Ajay Kumar Reddy Arram"); 
        System.out.println("************************");
        ComparableCircle cc1 = new ComparableCircle(3.7);
        ComparableCircle cc2 = new ComparableCircle(4.9);
        
        System.out.println("The area of first circle is "+cc1.area());
        System.out.println("The area of second circle is "+cc2.area());
        System.out.println("************************");
        if (cc1.compareTo(cc2) > 0) 
        {
            System.out.println("Area of the first circle is larger.");
        } 
        else if (cc1.compareTo(cc2) < 0)
        {
            System.out.println("Area of the second circle is larger");
        }
        else
        {
            System.out.println("Area of the two circles are same");
        }
    } 

}
