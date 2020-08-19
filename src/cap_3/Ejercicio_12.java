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
public class Ejercicio_12 {
    public static void main (String args []){
    
        
        double val,iva_val=0,cod_val=0;
        String iva,cod;
       
        
        Scanner s = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        
        
        //Introduccion de dato a evaluar
        System.out.print("Introduce la base imponible : ");
        val = s.nextInt();
        System.out.println();
        
        //Introduccion del tipo de IVA
        System.out.print("Introduzca el tipo de IVA(general,reducido o superreducido) : ");
        iva=b.nextLine();
        System.out.println();
        
        //Introduccion de codigo promocional
        System.out.print("Introduzca el codigo promocional (nopro , mitad, meno5, 5porc) : ");
        cod=c.nextLine();
        System.out.println("");
        
        //evaluacion de parametros
        
        System.out.println("Base imponible \t \t"+val);
        
        //Seleccion de IVA
        
        switch(iva){
            case "general":
                    iva_val = 0.21*val;
                    System.out.println("IVA ("+(0.21*100)+"%) \t\t"+iva_val);
                    break;
                
                case "reducido":
                    iva_val = 0.1*val;
                    System.out.println("IVA ("+(0.1*100)+"%) \t\t"+iva_val);
                    break;
                
                case "superreducido":
                    iva_val = 0.04*val;
                    System.out.println("IVA ("+(0.04*100)+"%) \t\t"+iva_val);
                    break;
                
                default:
                    System.out.println("Error al ingresar el comando");
                    break;
        }
        
        cod_val= val+iva_val;
        System.out.println("Precio con IVA \t\t"+cod_val);
        
        switch(cod){
            case "nopro":
                    System.out.println("Cod. promo (nopro) \t"+cod_val);
                    break;
                
                case "mitad":
                    System.out.println("Cod. promo (mitad) \t"+(0.5*cod_val));
                    break;
                
                case "meno5":
                    System.out.println("Cod. promo (meno5) \t"+(cod_val-5));
                    break;
                    
                case "5porc":
                    System.out.println("Cod. promo (5porc) \t"+(0.95*cod_val));
                    break;
                
                default:
                    System.out.println("Error al ingresar el comando");
                    break;
        }
        
        
        
    }

}
