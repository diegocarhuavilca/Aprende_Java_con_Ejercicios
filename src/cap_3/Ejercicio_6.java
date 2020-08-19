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
public class Ejercicio_6 {
     public static void main (String args[]){
    
        double h,b;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingresar valor de altura : ");    h = s.nextDouble();     System.out.println();
        
        System.out.println("Ingresar valor de la base"); b = s.nextDouble();   
        
        System.out.println("El valor del area es ; "+ (b*h*0.5));
    }

}
