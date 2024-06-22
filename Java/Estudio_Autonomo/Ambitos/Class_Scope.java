package Estudio_Autonomo.Ambitos;

// Las variables y métodos declarados dentro de una clase pero fuera de cualquier método 
// son accesibles desde cualquier parte de esa clase.
// Las variables de clase pueden ser de instancia (no estáticas) o de clase (estáticas).
// Se puede acceder a las variables estáticas directamente por la clase y por todas las instancias de la clase.

public class Class_Scope {

        // Variable de clase (estática)
        static int contadorEstatico = 0;

        // Variable de instancia
        int contadorInstancia = 0;
    
        // Método de clase (estático)
        static void metodoEstatico() {
            // Puede acceder a contadorEstatico
            contadorEstatico++;
            System.out.println("Contador Estático: " + contadorEstatico);
        }
    
        // Método de instancia
        void metodoInstancia() {
            // Puede acceder a contadorInstancia
            contadorInstancia++;
            System.out.println("Contador de Instancia: " + contadorInstancia);
        }

}