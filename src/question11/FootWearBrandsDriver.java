/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class FootWearBrandsDriver {
public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 11 by Ajay Kumar Reddy Arram"); 
        FootWearBrands obj1 = new FootWearBrands(150,"Bata");
        FootWearBrands obj2 = new FootWearBrands(110," Lancer");
        FootWearBrands obj3 = new FootWearBrands(150,"Adidas");
        FootWearBrands obj4 = new FootWearBrands(250,"Bata");
        /*
        * obj1 and obj4 have same brand names
        * hashcode method and equals method used to get the attributes for  brand name
        * For this attribute we can get hash code.
        */
        System.out.println("************** Hash Code ************** ");
        System.out.println(obj1.hashCode()+ " : same value for obj4");
        System.out.println(obj2.hashCode()+" : Different value");
        System.out.println(obj3.hashCode()+" : Different value");
        System.out.println(obj4.hashCode()+ " : same value for obj1");
        
        /*
        * The same hash code returns for the same brandName attribute 
        */
        System.out.println("*************** Equals *************** ");
        
        /*
        * Prints false because the brandName attribute was different for both the objects.
        */        
        System.out.println(obj1.equals(obj3));
        /*
        * Prints true because the brandName attribute was same for both the objects.
        */
        System.out.println(obj1.equals(obj4));
        /*
        * Prints flase because the brandName attribute was different for both the objects.
        */        
        System.out.println(obj3.equals(obj2));
       
    }
    
    
}
