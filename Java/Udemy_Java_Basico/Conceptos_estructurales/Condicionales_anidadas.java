package Udemy_Java_Basico.Conceptos_estructurales;

//leccion sobre condicionales anidadas 

import java.util.Scanner;

public class Condicionales_anidadas {

    public static void main(String[] args){

        Scanner teclado=new Scanner(System.in);
        int nota1,nota2,nota3=0;
        System.out.print("Ingrese primer nota:");
        nota1=teclado.nextInt();
        System.out.print("Ingrese segunda nota:");
        nota2=teclado.nextInt();
        System.out.print("Ingrese tercer nota:");
        nota2=teclado.nextInt();
        int media=(nota1 + nota2 + nota3) / 3;

        // incio de condicionales solo usando if & else
        if (media >= 7) {
            System.out.print("notable/sobresaliente");
        } else { //condicional anidada dentro del else de la primera condicional
            if (media >= 4) {
             System.out.print("regular/bien");
            } else {
             System.out.print("regular/bien");
            }
        }
        teclado.close();
    }
}
