/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class EmployeeDriver {
    
    public static void printList(List<Employee> l){
        for(Employee e :l){
            System.out.println(e);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        System.out.println("Question 12 by Ajay Kumar Reddy Arram"); 
        // TODO code application logic here
        ArrayList<Employee> empList = new ArrayList<>();

        Employee emp1 = new Employee(07, "ajay", 25000);

        Employee emp2 = new Employee(12, "ramesh", 30000);

        Employee emp3 = new Employee(23, "suresh", 40000);

        Employee emp4 = new Employee(11, "anil", 50000);

        Employee emp5 = new Employee(32, "arjun", 70000);

        empList.add(emp1);

        empList.add(emp2);

        empList.add(emp3);

        empList.add(emp4);

        empList.add(emp5);

        System.out.println("The values in the list are:");

        printList(empList);

        Collections.sort(empList);

        System.out.println("****************************");

        System.out.println("Sorting the list by EmpID of employees");

        System.out.println("*****************************");

        printList(empList);

        System.out.println("*****************************");

        System.out.println("Sorting the list by salary of employees");

        System.out.println("******************************");

        Collections.sort(empList, new Comparator<Employee>(){
            @Override
            public int compare(Employee e1,Employee e2){
                return Double.compare(e1.getEmpSalary(), e2.getEmpSalary());
            }
                
        });

        printList(empList);
        System.out.println("*********************************");
        System.out.println("Sorting the list by Name of employees");
        System.out.println("*********************************");
        Collections.sort(empList, new Comparator<Employee>(){
            @Override
            public int compare(Employee e1,Employee e2){
                return e1.getEmpName().compareTo(e2.getEmpName());
            }        
        });
        printList(empList);
        System.out.println("*********************************");
    }
}
    
