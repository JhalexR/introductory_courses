package Udemy_Java_Basico.EstructuraCondicionalSimple1; //patrón arquitectónico de paquetes se estabece una jerarquia de paquetes


public class EstructuraCondicionalSimple1 {

    public static void main(String[] ar) {
        // variables
         Scanner teclado=new Scanner(System.in);
         float sueldo;
         System.out.print("Ingrese el sueldo:");
         sueldo=teclado.nextFloat();
         if (sueldo>3000) {
             System.out.println("Esta persona debe abonar impuestos");
         }
    }
}