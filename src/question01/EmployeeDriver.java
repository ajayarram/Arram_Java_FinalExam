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
public class EmployeeDriver extends Employee{
	
	private int empId;
	
	public EmployeeDriver(String name, String position, int id) {
		super(name, position);
		this.empId=id;
	}

	@Override
	public void work() {
		if(empId == 007){
			System.out.println("Developer");
		}else{
			System.out.println("Project Manager");
		}
	}
	
	public static void main(String args[]){
            
        /**
         * @param args the command line arguments
        */
        // TODO code application logic here
		//coding in terms of abstract classes
                System.out.println("Question 1 by Ajay Kumar Reddy Arram"); 
		Employee emp1 = new EmployeeDriver("Ajay","Male",007);
		Employee emp2 = new EmployeeDriver("keerthi","Female",001);
		emp1.work();
		emp2.work();
		//using method implemented in abstract class - inheritance
		emp2.promotion("Delivery manager");
		System.out.println(emp2.toString());
	}

}
