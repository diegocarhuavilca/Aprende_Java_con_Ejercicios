
package cap_4;

import java.util.Scanner;

/**
 * 
 * @author Diego Carhuavilca <diego.carhuavilca@gmail.com>
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        int hour;
        Scanner s_hour = new Scanner(System.in);
        
        System.out.print("Que hora es (solo valores enteros) : ");
        hour = s_hour.nextInt();
        
        if (hour<=12&&hour>=6)
            System.out.println("Buenos dias");
        else if (hour<=20&&hour>=13)
            System.out.println("Buenas tardes");
        else 
            System.out.println("Buenas noches");
  
        
    }

}
