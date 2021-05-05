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
public abstract class Employee {
	
	private String name;
	private String position;
	
	public Employee(String name, String position){
		this.name=name;
		this.position=position;
	}
	
	//abstract method
	public abstract void work();
	
	@Override
	public String toString(){
		return "Name:"+this.name+" ,Position:"+this.position;
	}

	public void promotion(String promotion) {
		this.position = promotion;
	}	
}
