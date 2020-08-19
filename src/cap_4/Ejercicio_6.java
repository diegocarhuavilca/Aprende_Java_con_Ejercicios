
package cap_4;

import java.util.Scanner;

/**
 * 
 * @author Diego Carhuavilca <diego.carhuavilca@gmail.com>
 */
public class Ejercicio_6 {
    
    public static void main(String[] args) {
        
        
        double h,t ;
        
        Scanner s_h = new Scanner(System.in);
        
        System.out.print("Inserte la altura deseada : ");
        h=s_h.nextDouble();
        
        t= Math.sqrt((2*h)/9.81);
        
        System.out.println("El tiempo que demora en caer es "+t);
    }
    
    

}
