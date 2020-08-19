

package cap_3;

import java.util.Scanner;

/**
 * 
 * @author Diego Carhuavilca <diego.carhuavilca@gmail.com>
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
        float grade,avg,n_grade;
        
        Scanner s_grade = new Scanner(System.in);
        Scanner s_avg = new Scanner(System.in);
        
        System.out.print("Introduce la primera nota del examen : ");
        grade = s_grade.nextFloat();
        System.out.println();
        
        System.out.print("'¿Que nota quieres sacar en el trimestre? : ");
        avg = s_avg.nextFloat();
        System.out.println();
        
        n_grade = ((10*avg)-(4*grade))/6;
        
        System.out.println("Para tener el promedio deseado necesitas : "+n_grade);
        
    }

}
