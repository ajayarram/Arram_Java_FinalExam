/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;
import java.util.ArrayList;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class RecursionLinear {

    /**
     * @param args the command line arguments
     */
    
    // for linear search elements need not to be in sorted order
     public static int elementSearch(int first, int last, int element,ArrayList<Integer> elementsList)
     {          
         if (last < first)        
         {            
             return -1;         
         }         
         if (elementsList.get(first) == element)        
         {            
             return first;        
         }          
         if (elementsList.get(last) == element)  
         {           
            return last;        
         }   
         
         // recursive call for this method
         return elementSearch(first+1, last-1, element ,elementsList);  
     }        public static void main(String[] args) {    
         // TODO code application logic here  
         System.out.println("Question 10 by Ajay Kumar Reddy Arram"); 
            ArrayList<Integer> arrList = new ArrayList<>();    
            arrList.add(1);        
            arrList.add(2);        
            arrList.add(5);      
            arrList.add(3);      
            arrList.add(4);      
            arrList.add(6);       
            arrList.add(8);             
            int index = elementSearch(0, arrList.size()-1, 3,arrList);       
             if(index>-1)   
             {           
                 System.out.println("Element present at index "+index);   
             }        
             else       
             {          
                 System.out.println("No Element found");      
             }   
     }   
}
    
   
