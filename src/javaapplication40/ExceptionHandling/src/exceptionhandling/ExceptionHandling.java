/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author Eranga
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 10;
        int b= 0;
        
        /* try
        {
           int answer = a/b; 
           /* System.out.println("Abc");
            System.out.println(answer);
        }
       /* catch(ArithmeticException ex)
        {
            System.out.println("Error :"+ex);
        }*/
        /*catch(Exception exc)
        {
            System.out.println("err : ");
            System.out.println(exc.getMessage());
        }
        finally
        {
            System.out.println("It will execute always"); 
        } */
        
        try {
           int ans = a/b;

} catch (Exception e) {
   
} catch (ArithmeticException a) {
    
}

    }
    
}
