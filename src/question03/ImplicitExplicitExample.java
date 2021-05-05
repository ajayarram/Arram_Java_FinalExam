/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

public class ImplicitExplicitExample {

    /**

     * @param args the command line arguments

     */   

    public static void main(String[] args) {

        // TODO code application logic here

        int a = 10;
        double b = 15.6767;
        float c;
        long d = 156456789;
        // for implicit conversion we dont have to specify manually. 
        //It automatically converts from higher data type to lower data type
        
        d = a;
        c = a;
         b = c;
       
        
        System.out.println("Question 3 by Ajay Kumar Reddy Arram");      
        System.out.println("To demonstarte Implicit Conversion");
        System.out.println("The integer value is "+a);
        System.out.println("The double value is "+b);
        System.out.println("The float value is "+c);
       System.out.println("The long value is "+d);
        System.out.println("--------------------------");
        System.out.println("");
        b = 12.4;
        c = (float)b;
        d = (long)c;
        a = (int)d;
        b = (double)a;
        System.out.println("Explicit Conversion");
        System.out.println("The integer value is "+a);
        System.out.println("The double value is "+b);
        System.out.println("The float value is "+c);
        System.out.println("The long value is "+d);        

    }   
}
    
    


