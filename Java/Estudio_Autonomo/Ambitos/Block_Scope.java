package Estudio_Autonomo.Ambitos;

//Las variables declaradas dentro de un bloque {} 
//(como dentro de un bucle o una estructura de control) 
//solo son accesibles dentro de ese bloque.
//La vida útil de estas variables está limitada al bloque de código donde se declaran.

public class Block_Scope {

    void metodo() {
        if (true) {
            // Variable local al bloque if
            int variableIf = 20;
            System.out.println("Variable If: " + variableIf);
        }
        // No se puede acceder a variableIf fuera del bloque if
        // System.out.println(variableIf); // Error de compilación
    }

}