
package cap_4;

import java.util.Scanner;

/**
 * 
 * @author Diego Carhuavilca <diego.carhuavilca@gmail.com>
 */
public class Ejercicio_4 {
    public static void main (String args[]){
        
    int hours,sum_hours;
    
    Scanner s_hours = new Scanner(System.in);
    
    
    System.out.print("Cuantas horas a la semana has trabajado");
    hours = s_hours.nextInt();
       
    
    if (hours>40) System.out.println("Pago : "+(hours*16));
    else System.out.println("Pago : "+(hours*12));
        
    
    
    
    }

    
}
