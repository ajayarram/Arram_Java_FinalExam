/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class Employee {
    /**

     * @param args the command line arguments

     */
    public void salaryCheck(double salary) 
    {
        if(salary<=30000)
        {
            throw new ArithmeticException("The salary of employee should be hiked becasue it is less than 30k");
        }
        else
        {
           System.out.println("The employee needs promotion becasue it is greater than 30k");
        }
    }
        public static void main(String[] args) {

        // TODO code application logic here

        System.out.println("Question 9 by Ajay Kumar Reddy Arram");

        try{
            Employee emp = new Employee();
            emp.salaryCheck(35000);
            emp.salaryCheck(25000);          
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

    }
    
}
