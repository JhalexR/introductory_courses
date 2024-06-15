package Estudio_Autonomo.Ambitos;

//Las variables declaradas dentro de un método solo son accesibles dentro de ese método.
//La vida útil de estas variables está limitada a la ejecución del método en el que se declaran

public class Method_Scope { 
    
        void metodo() {
            // Variable local al método
            int variableLocal = 10;
            System.out.println("Variable Local: " + variableLocal);
        }
    
        void otroMetodo() {
            // No se puede acceder a variableLocal aquí
            // System.out.println(variableLocal); // Error de compilación
        }
    
    
    
}
