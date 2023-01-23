ublic class TresEnRatlla {
    // mòduls de suport
    public static void mostraTaulell(char[][] taulell) {
        // mostra el contingut del taulell
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(taulell[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean casellaOcupada(char[][] taulell, int fila, int columna) {
        // retorna cert si la casella està ocupada
        return taulell[fila][columna] != '·';
    }
    public static boolean jugadorGuanya(char[][] taulell, char jugador) {
        // retorna cert si el jugador ha guanyat
        // comprova files
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (taulell[i][j] == jugador){
                    return true;
                }
            }
        }
        // comprova columnes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (taulell[j][i] == jugador){
                    return true;
                }
            }
        }
        // comprova diagonals
        if (taulell[0][0] == jugador && taulell[1][1] == jugador && taulell[2][2] == jugador) {
            return true;
        }
        if (taulell[0][2] == jugador && taulell[1][1] == jugador && taulell[2][0] == jugador) {
            return true;
        }
        return false;
    }
    public static boolean hiHaEmpat(char[][] taulell) {
        // retorna cert si no es pot fer cap moviment més
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (taulell[i][j] == '·') {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // declara i inicialitza el taulell
        char[][] taulell = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                taulell[i][j] = '·';
            }
        }
        System.out.println("Comença el joc");
        // indica quin és el jugador que té el torn
        char jugador = 'X';
        while (true) {
            mostraTaulell(taulell);
            System.out.println(jugador + "?");
            // demana coordenades del moviment
            String text = Entrada.readLine();
            if (text.equals("a")) {
                System.out.println(jugador + " abandona");
                break;
            }
            // comprova que les coordenades siguin vàlides
            if (text.length() != 2) {
                System.out.println("Error");
                continue;
            }
            int fila = text.charAt(0) - '0';
            int columna = text.charAt(1) - '0';
            if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                System.out.println("Error");
                continue;
            }
            // comprova que la casella estigui buida
            if (casellaOcupada(taulell, fila, columna)) {
                System.out.println("Ocupada");
                continue;
            }
            // marca la casella i comprova si ha guanyat o ha empatat
            taulell[fila][columna] = jugador;
            if (jugadorGuanya(taulell, jugador)) {
                mostraTaulell(taulell);
                System.out.println(jugador + " guanya");
                break;
            } else if (hiHaEmpat(taulell)) {
                mostraTaulell(taulell);
                System.out.println("Empat");
                break;
            }
            // passa el torn al següent jugador
            jugador = (jugador == 'X') ? 'O' : 'X';
        }
    }
}
