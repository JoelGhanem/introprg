/*En aquesta ocasió representarem tot el taulell, no amb variables separades fila0, fila1 i fila2, sinó amb una taula de caràcters.*/
public class TresEnRatlla {
    public static void main(String[] args){
        // declaració del taulell
        char[][] taulell = new char[3][3];
        // inicialització de la fila 0
        taulell[0][0] = '·';
        taulell[0][1] = 'O';
        taulell[0][2] = 'O';
        // inicialització de la resta de files
        taulell[1][0] = '·';
        taulell[1][1] = 'X';
        taulell[1][2] = '·';
        // Inicialitzacio fila2
        taulell[2][0] = '·';
        taulell[2][1] = '·';
        taulell[2][2] = 'X';
        // mostra la posició inicial del taulell
        System.out.println("La posició inicial del taulell:");
        mostraFila(taulell[0]);// mostra la línia 0
        mostraFila(taulell[1]);// mostra la línia 1
        mostraFila(taulell[2]);// mostra la línia 2

        // demana coordenades del moviment del jugador X
        System.out.println("Fila del següent moviment?");
        int fila = Integer.parseInt(Entrada.readLine());
        System.out.println("Columna del següent moviment?");
        int columna = Integer.parseInt(Entrada.readLine());

        // marquem el nou moviment
        taulell[fila][columna] = 'X';

        // tornem a mostrar el taulell
        System.out.println("La posició final del taulell:");
        mostraFila(taulell[0]);// mostra la línia 0
        mostraFila(taulell[1]);// mostra la línia 1
        mostraFila(taulell[2]);// mostra la línia 2
    }

    // mostra el contingut de la fila per sortida estàndard
    public static void mostraFila(char[] fila) {
        for (int i = 0; i < fila.length;i++) {
            System.out.print(fila[i]);
        }
        System.out.println();
    }
}
