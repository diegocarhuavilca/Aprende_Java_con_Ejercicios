/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_1;

/**
 *
 * @author Diego
 */
public class Ejercicio_5 {
     public static void main(String[] args) {
         
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        
        
        System.out.println(rojo+"hora\tlun\tmar\t"+verde+"mie\tjue\tvie");
        System.out.println(naranja+"08:00\t"+azul+"ABC\tdfe\t\t"+morado+"DLL\tFFFF");
    }
    
}
