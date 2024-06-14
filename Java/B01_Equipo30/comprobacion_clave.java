package B01_GRUPO30;

import java.util.Scanner;

// definicion de clase para comprobacion de contrasena segura
public class comprobacion_clave {
    
    public static void main(String[] args) {

        //captura de contrasena en cadena de caracteres
        Scanner clavve = new Scanner(System.in);                        
        String contrAsena;
        System.out.println("Ingrese una contrasena:");
        contrAsena = clavve.next(); 

        //llamado a metodo para validar si la contrasena es segura
        boolean result = verificar_clave(contrAsena);

            //resultado de si la contrasena es segura
        if (result == true)                                       
        System.out.println("La contrasena ingresada es segura.");
        else 
        System.out.println("La contrasena ingresada no es segura."); 
        
    }

    // metodo para validar si la contrasena es segura
    static boolean verificar_clave(String contrAsenAA){
        boolean score = false;
        // validar longitud de la contrasena
        if (contrAsenAA.length() >= 10) { 
            // variables para cada requisito de la contraseña segura
            boolean nuumero = false;                                  
            boolean lettra_may = false; 
            boolean lettra_min = false; 
            boolean symbolo = false; 
            char possiccion;
    
            // validar los requisitos de la contasena
            for(int i=0; i<contrAsenAA.length(); i++) {                   
                possiccion = contrAsenAA.charAt(i);
            // validar presencia de numeros en la contrasena
                if (Character.isDigit(possiccion))                           
                nuumero = true;
                else {
                    // validar presencia de letras en la contrasena
                    if (Character.isLetter(possiccion))     
                    // validar presencia de letras mayusculas en la contrasena
                        if(Character.isUpperCase(possiccion))                    
                        lettra_may = true;
                        // validar presencia de letras mayusculas en la contrasena
                        else
                        lettra_min = true;
                    // validar presencia de simbolos en la contrasena    
                    else 
                        symbolo = true;                    
                    }
        }
    // verificación de cumplimiento de todos los requisitos de la contrasena segura
        if(nuumero == true && lettra_may == true && lettra_min == true && symbolo == true)
            score = true;
        else
            score = false;
        
        return score;
        }    
    
        else
            return score;
    } 

}
