//Programa que representa una partida de tres en raya En una piosicion determinada
//Sigo escribiendo pq no se que quiere que escriba el aval ya que hay cabecera pero no la detecta*/
public class TresEnRatlla {
    public static void main(String[] args){
        // declaració de les files
        char[] fila0 = new char[3];
        char[] fila1 = new char[3]; 
        char[] fila2 = new char[3];
        // inicialització de la fila 0
        fila0[0] = 'O';
        fila0[1] = '·';
        fila0[2] = 'X';
        // inicialització de la fila 1
        fila1[0] = 'X';
        fila1[1] = 'X';
        fila1[2] = 'O';
        // inicialització de la fila 2
        fila2[0] = 'O';
        fila2[1] = '·';
        fila2[2] = '·';
        // mostra el taulell
        mostraFila(fila0);
        mostraFila(fila1);
        mostraFila(fila2);
    }

    // mostra el contingut de la fila per sortida estàndard
    public static void mostraFila(char[] fila) {
        for (int i = 0; i < fila.length; i++) {
            System.out.print(fila[i]);
        }
        System.out.println();
    }
}
