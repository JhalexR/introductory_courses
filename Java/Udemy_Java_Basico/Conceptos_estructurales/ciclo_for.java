package Udemy_Java_Basico.Conceptos_estructurales;

import java.util.Scanner;

//ciclo for cuando se conoce en numero de veces que se requiere que se repita el ciclo

public class ciclo_for {

    public static void main(String[] args) {
        // El problema requiere que se carguen 10 valores y se sumen los mismos.
                Scanner teclado=new Scanner(System.in);
                int suma,f,valor,promedio;
                suma=0;
                for(f=1;f<=10;f++) {
                    System.out.print("Ingrese valor:");
                    valor=teclado.nextInt();
                    suma=suma+valor;
                }
                System.out.print("La suma es:");
                System.out.println(suma);
                promedio=suma/10;
                System.out.print("El promedio es:");
                System.out.print(promedio);
                teclado.close();
    }
    
}
