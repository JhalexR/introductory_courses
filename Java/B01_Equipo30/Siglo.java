package B01_GRUPO30;

/*
 * Autores
 * 
 * Maryurry Alexandra Rodriguez Jimenez
 * Diana Carolina Bolivar Buitrago
 * Juan Camilo Cortes Martinez
 * John Alexander Peñaloza Rojas 
 * 
 */

 import java.util.Scanner;

public class Siglo {
    public static int siglo(int year) {
	       
        int siglo = (year + 99) / 100;
        return siglo;
	}
        
        public static int primer_anho(int siglo) {
            int primer_anho = (siglo - 1) * 100 + 1;
            return primer_anho;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un año positivo: ");
            int year = scanner.nextInt();
           
            int siglo = siglo(year);
            
            int primer_anho = primer_anho(siglo);
            
            System.out.println("El año " + year + " pertenece al siglo " + siglo);
            System.out.println("El primer año del siglo " + siglo + " es " + primer_anho);
            
            scanner.close();
        }
}
