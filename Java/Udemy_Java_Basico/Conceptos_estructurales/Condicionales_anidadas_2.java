package Udemy_Java_Basico.Conceptos_estructurales;

//leccion sobre condicionales anidadas 

import java.util.Scanner;

public class Condicionales_anidadas_2 {

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
    
        //segundo ejemplo de condicionales anidadas usando if & else 6 else if
    
        if(media == 9 || media == 10){
            System.out.print("sobresaliente");
        } else if (media == 5){ 
            System.out.print("suficiente");
        } else if(media == 6){
            System.out.print("bien");
        } else if(media == 7 || media == 8){
            System.out.print("regular/bien");
        }else{
            System.out.print("insuficiente");
        }
        teclado.close();
    }

}
