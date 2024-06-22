package Estudio_Autonomo;

// Ejemplo de cómo se utilizan static, public y String[] args en un programa de Java.

public class Conceptos_2 {
    
        // Variable estática
        static int contador = 0;
    
        // Método estático
        public static void incrementarContador() {
            contador++;
        }
    
        // Método principal (entry point)
        public static void main(String[] args) {
            // Incrementar el contador estático
            incrementarContador();
    
            // Mostrar el valor del contador
            System.out.println("Contador: " + contador); // Salida: Contador: 1
    
            // Mostrar argumentos de línea de comandos
            if (args.length > 0) {
                for (String arg : args) {
                    System.out.println("Argumento: " + arg);
                }
            } else {
                System.out.println("No se han pasado argumentos.");
            }
        }    

}
