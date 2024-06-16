package Udemy_Java_Basico.Conceptos_estructurales;

import java.util.Scanner;

//ciclo while leccion

public class Bucle_While {

    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
        while (x<=n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
        teclado.close();
    }
}
