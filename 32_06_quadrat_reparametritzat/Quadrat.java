//Farem ara una nova versió del quadrat parametritzat. En aquesta ocasió, el programa serà capaç de mostrar un caràcter diferent de X a partir del que main() rebi a args[1]//
public class Quadrat {
    public static void main(String[] args) {
        int costat = Integer.parseInt(args[0]);
        char caracter = args[1].charAt(0);
        dibuixaQuadrat(costat, caracter);
    }
    public static void dibuixaQuadrat(int costat, char caracter) {
        for (int li = 0; li < costat; li++) {
            dibuixaLinia(costat, caracter);
            System.out.println();
        }
    }
    public static void dibuixaLinia(int costat, char caracter) {
        for (int co = 0; co < costat; co++) {
            System.out.print(" " + caracter);
        }
    }
}

