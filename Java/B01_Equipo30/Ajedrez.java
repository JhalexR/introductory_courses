package B01_Equipo30;


public class Ajedrez {
        /*
     * Metodo para determinar si un caballo ataca a un rey en un tablero de ajedrez.
     * 
     * @param filaCab Fila del caballo
     * @param colCab Columna del caballo
     * @param filaRey Fila del rey
     * @param colRey Columna del rey
     * @return true si el caballo ataca al rey, false en caso contrario
     */

    public static boolean caballoAtacaRey(int filaCab, int colCab, int filaRey, int colRey) {
        int[][] movimientosCaballo = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
        
        for (int[] movimiento : movimientosCaballo) {
            int nuevaFila = filaCab + movimiento[0];
            int nuevaCol = colCab + movimiento[1];
            
            if (nuevaFila == filaRey && nuevaCol == colRey) {
                return true;
            }
        }
        
        return false;
    }

        /*
     * Metodo principal para interactuar con el usuario y determinar si el caballo ataca al rey.
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Ingrese la fila y columna del caballo (ejemplo: 1 2):");
        int filaCab = sc.nextInt();
        int colCab = sc.nextInt();
        
        System.out.println("Ingrese la fila y columna del rey (ejemplo: 3 4):");
        int filaRey = sc.nextInt();
        int colRey = sc.nextInt();
        
        if (caballoAtacaRey(filaCab, colCab, filaRey, colRey)) {
            System.out.println("El caballo ataca al rey.");
        } else {
            System.out.println("El caballo no ataca al rey.");
        }
        
        sc.close();
    }
}