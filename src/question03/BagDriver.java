/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class BagDriver {
     /* @param args the command line arguments

     */
   public static void main(String args[])
   {
   

        // TODO code application logic here

        System.out.println("Question 3 by Ajay Kumar Reddy Arram");

        System.out.println("******************************");

        System.out.println("To demonstrate Implicit type casting");
        
        LuggageBag lb = new LuggageBag();

        Bag b=lb;

        b.bagLenght();

        System.out.println("********************************");

        System.out.println("To demonstrate Explicit type casting");

        LuggageBag lb2 = (LuggageBag)b;

        lb2.bagLenght();
   }
}

