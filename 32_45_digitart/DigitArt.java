/* XXX */
public class DigitArt {
    public static char[][] construeix1() {
        return new char[][] {
            {'·', '·', '·', '·', '·'},
                {'·', 'X', 'X', '·', '·'},
                {'·', '·', 'X', '·', '·'},
                {'·', '·', 'X', '·', '·'},
                {'·', '·', 'X', '·', '·'},
                {'·', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', '·'}
        };
    }
    public static char[][] construeix2() {
        return new char[][] {
            {'·', '·', '·', '·', '·', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', 'X', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', 'X', '·', '·', '·', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', '·', '·'},
        };
    }
    public static char[][] construeix3() {
        return new char[][] {
            {'·', '·', '·', '·', '·', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', 'X', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', 'X', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', '·', '·'},
        };
    }
    public static void mostraResultat(char[][] origen, char[][] resultat) {
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[0].length; j++) {
                System.out.print(origen[i][j]);
            }
            System.out.print(" -> ");
            for (int j = 0; j < origen[0].length; j++) {
                System.out.print(resultat[i][j]);
            }
            System.out.println();
        }
    }
    public static void processaCaracter(char ch) {
        char[][] origen;
        switch (ch) {
            case '1': origen = construeix1();
                      break;
            case '2': origen = construeix2();
                      break;
            case '3': origen = construeix3();
                      break;
            default: return;    // no conec aquest caràcter
        }
        char[][] desti = UtilTaula.substitueix(origen, 'X', ch);
        mostraResultat(origen, desti);
        System.out.println();
    }
    public static void processaArgument(String arg) {
        for (int i = 0; i < arg.length(); i++) {
            processaCaracter (arg.charAt(i));
        }
    }
    public static void main(String[] args){
        if (args.length > 0) {
            /* XXX */
            // processa cada argument
            String argumentos = "";
            for (int i = 0; i < args.length; i++) {
                argumentos = argumentos + args[i];
            }
            processaArgument(argumentos);
        }
    }
}
