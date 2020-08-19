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
public class Ejercicio_8 {
    public static void main (String args[]){
    double val,sum=0;
    Scanner s = new Scanner(System.in);
    
    for(int i = 0;i<7;i++){
        System.out.print("Ingrese cantidad de horas trabajadas el dia "+(i+1)+" : ");
            val = s.nextDouble();
            sum+=val;
            System.out.println();
        }
    
        System.out.println("El salario semanal es : " +(sum*12));
    
    }
}
