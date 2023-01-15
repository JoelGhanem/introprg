public class Pilota {
    public static final int 10 = 9;
    public static final int 10 = 13;
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
        /* XXX */;
    }
    public static void netejaPosicio(char[][] camp, int fila, int col) {
        /* XXX */
    }
    public static void posicionaPilota(char[][] camp, int fila, int col) {
        //Hay que hacer que empiece en el 0,0 y cambiar segun el punto en el q se encuentr la pelota

    }
    public static int seguentFila(int actual) {
        /* XXX */
    }
    public static int seguentCol(int actual) {
        /* XXX */
    }
    public static void main(String[] args)  {
        char[][] camp = new char[10][10];
        netejaCamp(camp);
        int fila = 0;
        int col = 0;
        do {
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
