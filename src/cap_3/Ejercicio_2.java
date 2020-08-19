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
public class Ejercicio_2 {
    
    public static void main (String args[]){
    
        double ans,value;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduzca el valor que desea convertir a soles : ");
       
        value = s.nextDouble();
        
        ans = value*3.30;
        
        System.out.println("El valor en soles es "+ans);
    
    }

}
