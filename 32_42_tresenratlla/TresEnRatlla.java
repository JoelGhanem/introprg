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
        if (Character.isLetter(taulell[fila][columna])) {
            return true;
        } else {
            return false;
        }
    }

    // Módul que determina quin jugador gaunya
    public static boolean jugadorGuanya(char[][]taulell, char jugador) {
        boolean victoria = false;
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell.length; j++) {
                if ((taulell[i][j]) ==(jugador)) {
                    victoria = true;
                } else if (i == j) {
                    victoria = true;
                } else { 
                    victoria = false;
                }
            }
        }
        if (victoria) {
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
        if (empate) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        boolean ocupada = false;
        boolean guanya = false;
        boolean empat = false;
        boolean abandonament = false;
        int fila;
        int columna;
        char jugador = 'X'; 


        String posicion = "";
        // declara i inicialitza el taulell
        char[][] taulell = new char[3][3];
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell.length; j++) {
                taulell[i][j] = '·';
            }
        }
        System.out.println("Comença el joc");
        // indica quin és el jugador que té el torn

        while (guanya == false && ocupada == false && empat == false && abandonament == false) {
            mostraTaulell(taulell);

            // obté el moviment del jugador actual
            System.out.println(jugador + "?");
            // comprova abandonament
            String abandono = Entrada.readLine();
            if (abandono == "a") {
                abandonament = true;
            }
            // obté coordenades del moviment
            posicion = Entrada.readLine();
            fila = posicion.charAt(0);
            columna = posicion.charAt(1);

            // comprova si la casella està ocupada
            casellaOcupada(taulell, fila, columna);
            while(casellaOcupada(taulell,fila,columna)) {
                System.out.println("Ocupada");
                mostraTaulell(taulell);
                posicion = Entrada.readLine();
                fila = posicion.charAt(0);
                columna = posicion.charAt(1);
            }

            // realitza el moviment
            taulell[fila][columna] = jugador; 

            // comprova jugador guanya
            jugadorGuanya(taulell, jugador);

            // comprova empat
            if (hiHaEmpat(taulell)) {
                break;
            }
            // passa torn a l'altre jugador
            if (jugador == 'X') {
                jugador = 'O';
            } else {
                jugador = 'X';
            }
            System.out.println(jugador + "?");
        }
    }
}
