/*Fem un tic tac toe millor on es pot jugar i que et siu ui ha guanyat*/
public class TresEnRatlla {

    // mòduls de suport
    // Mòdul que mosrta el taulell a la pantalla//
    public static void mostraTaulell (char[][] taulell) {
        for (int fila = 0; fila < taulell.length; fila++) {
            for (int col = 0; col < taulell.length; col++) {
                System.out.print(taulell[fila][col]);
            }
            System.out.println();
        }
    }

    //Mòdul que diu si la casella está ocupada
    public static boolean casellaOcupada(char[][] , int fila, int columna) {
        if (Character.isLetter(taulell[fila][columna])) {
            return true;
        } else {
            return false;
        }
    }

    // Módul que determina quin jugador gaunya
    public static boolean jugadorGuanya(char[][], char jugador) {

    }
    public static void main(String[] args) {
        // declara i inicialitza el taulell
        char[][] taulell = new char[3][3];
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell.length; j++) {
                taulell[i][j] = '·';
            }
        }
        System.out.println("Comença el joc");
        // indica quin és el jugador que té el torn

        while (/* XXX */) {
            mostraTaulell(taulell);

            // obté el moviment del jugador actual
            /* XXX */

            // comprova abandonament
            /* XXX */

            // obté coordenades del moviment
            /* XXX */

            // comprova si la casella està ocupada
            casellaOcupada(taulell, fila, columna);
            while(casellaOcupada(taulell,fila,columna)) {
                System.out.println("Ocupada");
                mostraTaulell(taulell);
                fila = Integer.parseInt(Entrada.readLine())

            }

            // realitza el moviment
            mostraTaulell(taulell);

            // comprova jugador guanya
            /* XXX */

            // comprova empat
            /* XXX */

            // passa torn a l'altre jugador
            System.out.println("X?");
        }
    }
}
