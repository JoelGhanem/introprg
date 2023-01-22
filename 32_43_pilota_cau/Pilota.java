public class Pilota {
    public static final int N_FILES = 9;
    public static final int N_COLS = 13;
    public static void netejaPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void mostraCamp(char[][] camp) {
        for (int i=0; i<9; i++) {
            for (int j=0; j<13; j++) {
                System.out.print(camp[i][j]);
            }
            System.out.println();
        }
    }
    public static void netejaCamp(char[][] camp) {
        for (int i = 0; i < N_FILES; i++) {
            for (int j = 0; j < N_COLS; j++) {
                camp[i][j] = '·';
            }
        }
    }
    public static void netejaPosicio(char[][] camp, int fila, int col) {
        camp[fila][col] = '·';
    }
    public static void posicionaPilota(char[][] camp, int fila, int col) {
        camp[fila][col] = 'O';
    }
    public static int seguentFila(int actual) {
        actual = actual + 1;
        if (actual >= 9) {
            actual = 0;
        }
        return actual;
    }
    public static int seguentCol(int actual) {
        actual = actual + 1;
        if (actual >= 13) {
            actual = 0;
        }
        return actual;
    }
    public static void main(String[] args)  {
        char[][] camp = new char[N_FILES][N_COLS];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 13; j++) {
                camp[i][j] = '·';
            }
        }
        int fila = 0;
        int col = 0;
        camp[fila][col] = 'O';
        do {
            netejaCamp(camp);
            posicionaPilota(camp, fila, col);
            netejaPantalla();
            mostraCamp(camp);
            netejaPosicio(camp, fila, col);
            fila = seguentFila(fila);
            col = seguentCol(col);
            System.out.printf("%nEnter per continuar");
        } while (Entrada.readLine().isEmpty());
    }
}
