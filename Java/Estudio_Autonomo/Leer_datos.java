package Estudio_Autonomo;

import java.util.Scanner;

public class Leer_datos {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Leer una cadena
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        System.out.println("Cadena ingresada: " + cadena);

        // Leer un entero
        System.out.print("Ingrese un entero: ");
        int entero = scanner.nextInt();
        System.out.println("Entero ingresado: " + entero);

        // Leer un número decimal
        System.out.print("Ingrese un número decimal: ");
        double decimal = scanner.nextDouble();
        System.out.println("Número decimal ingresado: " + decimal);
        
        // Leer un carácter
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);
        System.out.println("Carácter ingresado: " + caracter);
        
        // Cerrar el scanner
        scanner.close(); // Cerrar el Scanner: Es buena práctica cerrar el Scanner después de que ya no se necesite para liberar los recursos asociados.

    }   

}
