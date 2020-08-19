/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap_3;

import java.util.Scanner;

/**
 * 
 * @author Diego Carhuavilca <diego.carhuavilca@gmail.com>
 */
public class Ejercicio_4 {
    
    public static void main (String args[]){
     
        double sum,rest,mul,div,val1,val2;
        
        Scanner s = new Scanner(System.in);
        
  
        System.out.print("Ingrese el los valores a evaluar : ");
            val1 = s.nextDouble();
         System.out.println();  
         System.out.print("Ingrese el los valores a evaluar : ");
            val2 = s.nextDouble();
            
            sum = val1+val2;
            rest = val1-val2;
            mul = val1*val2;
            div = val1/val2;
        
        System.out.println("El valor de la suma es : "+sum);
        System.out.println("El valor de la resta es : "+rest);
        System.out.println("El valor de la multip es : "+mul);
        System.out.println("El valor de la div es : "+div);
    
    
    }

}
