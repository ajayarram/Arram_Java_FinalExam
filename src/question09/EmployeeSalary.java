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
public class EmployeeSalary {
    /**

     * @param args the command line arguments

     */
    public static void main(String[] args) {

        // TODO code application logic here
        System.out.println("Question 9 by Ajay Kumar Reddy Arram"); 
        try{
            SalaryCheck sal=new SalaryCheck();
       int salary=999;
       if(salary<1000){

            throw new IllegalArgumentException("Employee exploitation is happening. Should be addressed immediately");

        }else{

            System.out.println(sal.salaryCheck(0));

        }

        }catch(ArithmeticException ae){

            System.out.println(ae);

        }
        catch(RuntimeException e){
            System.out.println(e);
        }

    }

}
    
