/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper_dan_final;

/**
 *
 * @author IRFAN
 */
public class contohfinally {
  
    public static String myMethod()
    {
       try {
         return "Ini adalah pernyataan return dalam blok try";
         
       }
       finally {
         System.err.println("Ini adalah pernyataan dalam blok finally");
         System.err.println("Pernyataan ini dieksekusi walaupun blok try memiliki pernyataan return");
       }
    }
    
    public static void main(String args[])
    {
       System.out.println(myMethod());  
    }
}
