package Udemy_Java_Basico.Conceptos_estructurales; //patrón arquitectónico de paquetes se estabece una jerarquia de paquetes

import java.util.Scanner;

public class EstructuraCondicionalSimple1 {

    public static void main(String[] args) {
        // variables
         Scanner teclado=new Scanner(System.in);
         float sueldo;
         System.out.print("Ingrese el sueldo:");
         sueldo=teclado.nextFloat();
         if (sueldo>3000) {
             System.out.println("Esta persona debe abonar impuestos");
         }
    teclado.close();
    }
}