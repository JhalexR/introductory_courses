package Udemy_Java_Basico.Orientada_a_objetos;

import java.util.Scanner;

// leccion creacion de objetos

public class persona {

    // creacion de atributos

    private Scanner teclado; //atributo modificador de acceso private tipo Scanner 
    private String nombre;   //atributo modificador de acceso private tipo String 
    private int edad;        //atributo modificador de acceso private tipo int

    // metodo inicializar primero en ser usado desde el main desde el objeto creado

    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        nombre=teclado.next();
        System.out.print("Ingrese edad:");
        edad=teclado.nextInt();
        teclado.close();
    }

    // metodo imprimir segundo en ser usado desde el main desde el objeto creado

    public void imprimir() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Edad:"+edad);
    }

    // metodo esMayoredad terder en ser usado desde el main desde el objeto creado

    public void esMayorEdad() {
        if (edad>=18 && edad >=65) {
            System.out.print(nombre+" es mayor de edad para actividad laboral.");
        }else if(edad >65) {
            System.out.print(nombre+" Jubilado inactivo en vida laboral.");
        }else{
            System.out.print(nombre+" no es mayor de edad no puede entrar en actividad laboral.");
        }    
           
        }

    // metodo main

    public static void main(String[] args) {
       
        persona persona1=new persona();
        persona1.inicializar();
        persona1.imprimir();
        persona1.esMayorEdad();

    }


}
