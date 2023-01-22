/* Ara faré una pilota que rebota al arribar al final d'una fila o columna */
public class Pilota {
    public static final int N_FILES = 9;
    public static final int N_COLS = 14;
    public static void netejaPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void mostraCamp(char[][] camp) {
        for (int i = 0; i < N_FILES; i++) {
            for (int j = 0; j < N_COLS; j++) {
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
    public static void netejaPosicio(char[][] camp, int[] posicio) {
        int fila = obteFila(posicio);
        int col = obteCol(posicio);
        camp[fila][col] = '·';
    }
    public static void posicionaPilota(char[][] camp, int[] posicio) {
        int fila = obteFila(posicio);
        int col = obteCol(posicio);
        camp[fila][col] = 'O';
    }
    public static int obteFila(int[] posicio) {
        return posicio[0];
    }
    public static int obteCol(int[] posicio) {
        return posicio[1];
    }
    public static int obteIncrFila(int[] increment) {
        return increment[0];
    }
    public static int obteIncrCol(int[] increment) {
        return increment[1];
    }
    public static void canviaPosicio(int[] posicio, int novaFila, int novaCol) {
        posicio[0] = novaFila;
        posicio[1] = novaCol;
    }
    public static void canviaIncrement(int[] increment, int nouIncFila, int nouIncCol) {
        increment[0] = nouIncFila;
        increment[1] = nouIncCol;
    }
    public static void seguentPosicio(int[] posicio, int[] increment) {
        int fila = obteFila(posicio);
        int col = obteCol(posicio);
        int incFila = obteIncrFila(increment);
        int incCol = obteIncrCol(increment);
        // actualizar la fila
        fila += incFila;
        if (fila < 0) {                     // es passa per sobre
            fila = 1;                       // torna a la primera fila
            incFila = 1;                    // toca baixar
        } else if (fila > N_FILES -1) {     // es passa per sota
            fila = N_FILES - 2;             // torna a l'ultima fila
            incFila = -1;                   // toca pujar
        }
        // actualizar la columna
        col += incCol;
        if (col < 0) {                      // es passa per la esquerra
            col = 1;                        // torna a la primera columna
            incCol = 1;                     // toca anar a la dreta
        } else if (col > N_COLS -1) {       // es passa per la dreta
            col = N_COLS - 2;               // torna a l'ultima columna
            incCol = -1;                    // toca anar a l'esquerra
        }
        // actualizar la posición y el incremento
        canviaPosicio(posicio, fila, col);
        canviaIncrement(increment, incFila, incCol);
    }
    public static void main(String[] args)  {
        char[][] camp = new char[N_FILES][N_COLS];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 14; j++) {
                camp[i][j] = '·';
            }
        }
        netejaCamp(camp);
        int[] posicio = new int[2];         // fila, col
        canviaPosicio(posicio, 0, 0);       // posició inicial (0, 0)
        int[] increment = new int[2];       // incFila, incCol
        canviaIncrement(increment, 1, 1);   // desplaçament inicial: 1 fila 1 columna
        do {
            posicionaPilota(camp, posicio);
            netejaPantalla();
            mostraCamp(camp);
            netejaPosicio(camp, posicio);
            seguentPosicio(posicio, increment);
            System.out.printf("%nEnter per continuar");
        } while (Entrada.readLine().isEmpty());
    }
}
