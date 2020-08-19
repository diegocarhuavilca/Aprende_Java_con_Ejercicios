
package cap_4;

import java.util.Scanner;

/**
 * 
 * @author Diego Carhuavilca <diego.carhuavilca@gmail.com>
 */
public class Ejercicio_3 {
    public static void main (String args[]){
        
    int day;
    Scanner s_day = new Scanner(System.in);
    
        System.out.print("Elija un numero entre 1 y 7");
        day = s_day.nextInt();
    
    switch(day){
            case 1:
            System.out.println("Lunes");
            break;
            
            case 2:
            System.out.println("Martes");
            break;
            
            case 3:
            System.out.println("Miercoles");
            break;
            
            case 4:
            System.out.println("Jueves");
            break;
                        
            case 5:
            System.out.println("Viernes");
            break;
            
            case 6:
            System.out.println("Sabado");
            break;
            
            case 7:
            System.out.println("Domingo");
            break;
    
    }   
        
    }

}
