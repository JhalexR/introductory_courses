package Udemy_Java_Basico.Conceptos_estructurales;

import java.util.Scanner;

//ciclo Ciclo Do while a diferencia de los otros ciclos se ejecuta al menos una vez ya que los siclos for y while pueden no llegar a jecutarse

public class Ciclo_Do_while {

    public static void main(String[] args){
      
      Scanner teclado=new Scanner(System.in);
      int valor;
      do{
        System.out.print("introduce el valor entre 0 y 999 (0 finalizar):");
        valor=teclado.nextInt();
        if(valor>=100) {
          System.out.println("contiene tres número.");
        }else{
          System.out.println("contiene un número.");
        }
   }while(valor!=0);

    teclado.close();

    }

}
