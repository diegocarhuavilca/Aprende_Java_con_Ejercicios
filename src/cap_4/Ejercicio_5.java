
package cap_4;

import java.util.Scanner;

/**
 * 
 * @author Diego Carhuavilca <diego.carhuavilca@gmail.com>
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        double a , b;
        
        Scanner s_a = new Scanner(System.in);
        Scanner s_b = new Scanner(System.in);
        
        System.out.println("ax +b = 0");
        
        System.out.print("Inserte el valor de a = ");
        a = s_a.nextDouble();
        System.out.println();
        
        System.out.print("Inserte el valor de b = ");
        b = s_b.nextDouble();
        System.out.println();
        
        System.out.println("El resultado es : " + (-b/a));
        
        
    }

}
