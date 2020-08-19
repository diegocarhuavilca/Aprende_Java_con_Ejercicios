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
public class Ejercicio_1 {
    public static void main(String[] args) {
        int value,sum=0;
        
        Scanner  s = new Scanner(System.in);
        
        for(int i = 0; i<2;i++){
        
        System.out.print("Introduce valor "+(i+1)+" : ");
         value = s.nextInt();
         sum+=value;
            System.out.println();
        }
        System.out.println("El valor de la suma es : "+sum);
    }

}
