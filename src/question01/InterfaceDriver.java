/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class InterfaceDriver implements InterfaceOne , InterfaceTwo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 1 by Ajay Kumar Reddy Arram"); 
        InterfaceDriver id=new InterfaceDriver();
        id.printMessage();
        id.fact();
    }

    @Override
    public void printMessage() {
        System.out.println("A Message for today: Its a sunny day");
    }

    @Override
    public void fact() {
        System.out.println("Factual Statement: Heat always transfer from hotter body to colder body");
    }
    
}

