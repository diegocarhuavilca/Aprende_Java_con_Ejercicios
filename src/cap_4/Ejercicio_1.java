
package cap_4;

import java.util.Scanner;

/**
 * 
 * @author Diego Carhuavilca <diego.carhuavilca@gmail.com>
 */
public class Ejercicio_1 {
    public static void main (String args[]){
        
        Scanner s_day = new Scanner(System.in);
        String day;
        
        
        /*  lunes       =   MAT
            martes     =    ALG
            miercoles=   GEO
            jueves  = CHE
            viernes =  TRIG
            sabado  = FREE
            domingo= FREE
        */
        
        System.out.println("Pick one day to know your schedule : ");
        
        day = s_day.nextLine();
        
        switch(day){
            case "lunes":
                System.out.println("MAT");
                break;
            case "martes":
                System.out.println("ALG");
                break;
            case "miercoles":
                System.out.println("GEO");
                break;
            case "jueves":
                    System.out.println("CHE");
                break;    
            case "viernes":
                System.out.println("TRIG");
                break;
            default:
                System.out.println("FREE DAY");
                break;
            }
        
        
       
    
    
    }

}
