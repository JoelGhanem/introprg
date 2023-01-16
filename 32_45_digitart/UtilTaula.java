//Biblioteca que ens ajuda amb les taules //
public class UtilTaula {
    //Funció que espera una taula de NxM i dos caracters que retorna una amb les mateixes dimensions//
    public static char[][] substitueix(char[][]origen, char inici, char fi) {
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                if (origen[i][j] == inici) {
                    origen[i][j] = fi;
                }
            }
        }
        return origen;
    }
}




