/*Fem unhtic tac toe millor on es pot jugar i que et siu ui ha guanyat*/
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
        if (taulell[fila][columna] != '·') {
            return true;
        } else {
            return false;
        }
    }

    // Módul que determina quin jugador gaunya
    public static boolean jugadorGuanya(char[][]taulell, char jugador) {
        boolean guanya = false;
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell.length; j++) {
                if ((taulell[i][j]) ==(jugador)) {
                    guanya = true;
                    break;
                } else if (taulell[j][i] == (jugador)) {
                    guanya = true;
                    break;
                } else { 
                    guanya = false;
                }
            }
        }
        if (guanya) {
            return true;
        } else {
            return false;
        }
    }

    //Modul que determina si la partida es un empat
    public static boolean hiHaEmpat(char[][] taulell) {
        boolean empate = false;
        for (int li = 0; li <taulell.length; li++) {
            for (int col = 0; col <taulell.length; col++) {
                if (!Character.isLetter(taulell[li][col])) {
                    empate = true;
                } else { 
                    empate = false;
                }
            }
        }
        if (empate == true) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        boolean guanya = false;
        boolean empat = false;
        boolean abandonament = false;
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

        while (guanya == false && empat == false && abandonament == false) {
            mostraTaulell(taulell);

            // obté el moviment del jugador actual
            System.out.println(jugador + "?");
            // comprova abandonament
            String posicion = Entrada.readLine();
            if (posicion.equals("a")) {
                abandonament = true;
            } else {
                // obté coordenades del moviment
                //System.out.println("XXX Entrada rebuda es " + posicion);
                fila = Character.getNumericValue(posicion.charAt(0));
                columna = Character.getNumericValue(posicion.charAt(1));
                //System.out.printf("XXX fila:%d columna%d%n" ,fila,columna);

                // comprova si la casella està ocupada
                casellaOcupada(taulell, fila, columna);
                //System.out.printf("XXX fila:%d columna%d%n" ,fila,columna);
                while(casellaOcupada(taulell,fila,columna)) {
                    System.out.println("Ocupada");
                    mostraTaulell(taulell);
                    posicion = Entrada.readLine();
                    casellaOcupada(taulell, fila, columna);
                    if (posicion.equals("a")) {
                        abandonament = true;
                    }
                    fila = Character.getNumericValue(posicion.charAt(0));
                    columna = Character.getNumericValue(posicion.charAt(1));
                }

                // realitza el moviment
                //System.out.println("chivato antes taulell");
                taulell[fila][columna] = jugador; 

                // comprova jugador guanya
                //System.out.println("chivato antes jugadorGuanya");
                jugadorGuanya(taulell, jugador);

                // comprova empat
                //System.out.println("chivato antes hihaempat");
                if (!hiHaEmpat(taulell)) {
                    break;
                }
                // passa torn a l'altre jugador
                //System.out.println("chivato antes hihaempat");

                if (jugador == 'X') {
                    jugador = 'O';
                } else {
                    jugador = 'X';
                }

                System.out.println(jugador + "?");
            }
        }
        if (abandonament) {
            System.out.println(jugador + " abandona");
        }
        if (guanya) {
            System.out.println(jugador + " guanya");
        }
        if (empat) {
            System.out.println("hi ha empat");
        }
    }
}
