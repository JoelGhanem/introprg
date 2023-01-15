/*Fem un tic tac toe millor on es pot jugar i que et diu qui ha guanyat*/
public class TresEnRatlla {

    // mòduls de suport
    // Mòdul que mosrta el taulell a la pantalla//
    public static void mostraTaulell (char[][]taulell) {
        for (int fila = 0; fila < taulell.length; fila++) {
            for (int col = 0; col < taulell.length; col++) {
                System.out.print(taulell[fila][col]);
            }
            System.out.println();
        }
    }

    //Mòdul que diu si la casella está ocupada
    public static boolean casellaOcupada(char[][]taulell , int fila, int columna) {
        //System.out.printf("XXX fila:%d columna%d%n" ,fila,columna);
        return taulell[fila][columna] != '·' ? true : false;
    }

    // Módul que determina quin jugador gaunya
    public static boolean jugadorGuanya(char[][]taulell, char jugador) {
        for (int i = 0; i < taulell.length; i++) {
            boolean guanya = false;
            for (int j = 0; j < taulell.length; j++) {
                //files
                if ((taulell[i][j]) !=(jugador)) {
                    guanya = true;
                    break;
                } 
                //columnes
                if (taulell[j][i] != (jugador)) {
                    guanya = true;
                    break;
                }
            } 
            if(guanya) {
                return false;
            }
        }
        //diagonals
        boolean guanya = false;
        for (int i = 0; i < taulell.length; i++) {
            if (taulell[i][i] != jugador) {
                guanya = true;
                break;
            }
        }
        if (guanya) {
            return false;
        }
        guanya = false;
        for (int i = 0; i < taulell.length; i++) {
            if (taulell[i][taulell.length - i - 1] != jugador) {
                guanya = true;
                break;
            }
        }
        if (guanya) { 
            return false;
        }
        return true;
    }

    //Modul que determina si la partida es un empat
    public static boolean hiHaEmpat(char[][] taulell) {
        for (int i = 0; i <taulell.length; i++) {
            for (int j = 0; j <taulell.length; j++) {
                if (taulell[i][j] == '·') {
                    return  false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int fila = 0;
        int columna = 0;
        char jugador = 'X'; 


        // declara i inicialitza el taulell
        char[][] taulell = new char[3][3];
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell.length; j++) {
                taulell[i][j] = '·';
            }
        }
        System.out.println("Comença el joc");
        // indica quin és el jugador que té el torn

        while (true) {
            mostraTaulell(taulell);

            // obté el moviment del jugador actual
            System.out.println(jugador + "?");
            // comprova abandonament
            String posicion = Entrada.readLine();
            if (posicion.equals("a")) {
                System.out.print(jugador + " abandona");
                break;
            }
            // obté coordenades del moviment
            //System.out.println("XXX Entrada rebuda es " + posicion);
            fila = Character.getNumericValue(posicion.charAt(0));
            columna = Character.getNumericValue(posicion.charAt(1));
            //System.out.printf("XXX fila:%d columna%d%n" ,fila,columna);

            // comprova si la casella està ocupada
            if (casellaOcupada(taulell, fila, columna)) {
                System.out.println("Ocupada");
                continue;
                //System.out.printf("XXX fila:%d columna%d%n" ,fila,columna);
            }
            // realitza el moviment
            //System.out.println("chivato antes taulell");
            taulell[fila][columna] = jugador; 
            // comprova jugador guanya
            //System.out.println("chivato antes jugadorGuanya");
            if (jugadorGuanya(taulell, jugador)) {
                mostraTaulell(taulell);
                System.out.println(jugador + " guanya");
                return;
            }
            // comprova empat
            if (hiHaEmpat(taulell)) {
                mostraTaulell(taulell);
                System.out.println(jugador + " Hi ha empat");
                return;
            }
            // passa torn a l'altre jugador
            // System.out.println("chivato antes empat");
            jugador = (jugador == 'X') ? 'O' : 'X';
        }
    }
}
