/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;


/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class ArithmeticOperation {

    /**

     * @param args the command line arguments

     */
    public static void main(String[] args) {
        System.out.println("Question 8 by Ajay Kumar Reddy Arram"); 
        // TODO code application logic here
        try {
            int a=5;
            int c=0;
            double b=a/c;
        }
        catch (ArithmeticException e) {

            System.out.println("the value is infinity.i.e, divided by zero."
                    + "Please check the arithemtic operation "+e);

        }

    }   
}
