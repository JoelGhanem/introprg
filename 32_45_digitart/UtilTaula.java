//Biblioteca que ens ajuda amb les taules //
public class UtilTaula {
    //Funció que espera una taula de NxM i dos caracters que retorna una amb les mateixes dimensions//
    public static char[][] substitueix(char[][]origen, char inici, char fi) { 
        char[][] resultat = new char[origen.length][origen[0].length];
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                resultat[i][j] = origen[i][j];
                if (resultat[i][j] == inici) {
                    resultat[i][j] = fi;
                }
            }
        }
        return resultat;
    }
}
