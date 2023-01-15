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
            boolean guanya = true;
            for (int j = 0; j < taulell.length; j++) {
                //files
                if ((taulell[i][j]) !=(jugador)) {
                    guanya = false;
                } 
                //columnes
                if (taulell[j][i] != (jugador)) {
                    guanya = false;
                }
                //diagonals
                if (taulell[1][1] != (jugador) && taulell[0][0] != (jugador) && taulell[2][2] != (jugador)) {
                    guanya = false;
                } 
                if (taulell[0][2] != jugador && taulell[1][1]  != jugador && taulell[2][0] != (jugador)) {
                    guanya = false;
                }
            } 
            if(guanya == true) {
                return true;
            }
        }
        boolean victoriaDiagonal1 = true;
        boolean victoriaDiagonal2 = true;
        for (int i = 0; i < taulell.length; i++) {
            if (taulell[i][i] != jugador) {
                victoriaDiagonal1 = false;
            }
            if (taulell[i][taulell.length - i - 1] != jugador) {
                victoriaDiagonal2 = false;
            }
            if (victoriaDiagonal1 || victoriaDiagonal2) {
                return true;
            }
        }
        return false;
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
        int fila = 9;
        int columna = 9;
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
                //System.out.printf("XXX fila:%d columna%d%n" ,fila,columna);
            } else {
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
}
