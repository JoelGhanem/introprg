public class Pilota {
    public static final int n_files = 10;
    public static final int n_col = 10;
    public static void netejaPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void mostraCamp(char[][] camp) {
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(camp[i][j]);
            }
            System.out.println();
        }
    }
    public static void netejaCamp(char[][] camp) {
        System.out.flush();
    }
    public static void netejaPosicio(char[][] camp, int fila, int col) {
        camp[fila][col] = '·';
    }
    public static void posicionaPilota(char[][] camp, int fila, int col) {
        camp[fila][col] = 'O';

    }
    public static int seguentFila(int actual) {
        actual = actual + 1;
        if (actual >= 10) {
            actual = 0;
        }
        return actual;
    }
    public static int seguentCol(int actual) {
        actual = actual + 1;
        if (actual >= 10) {
            actual = 0;
        }
        return actual;
    }
    public static void main(String[] args)  {
        char[][] camp = new char[10][10];
        for (int i = 0; i < camp.length; i++) {
            for (int j = 0; j < camp.length; j++) {
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
