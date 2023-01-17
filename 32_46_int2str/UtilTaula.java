public class UtilTaula {
	public static char[][] substitueix(char[][] taula, char inici, char fi) {
		char[][] resultat = new char[taula.length][taula[0].length];
		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula[i].length; j++) {
				if (taula[i][j] == inici) {
					resultat[i][j] = fi;
				} else {
					resultat[i][j] = taula[i][j];
				}
			}
		}
		return resultat;
	}
	public static void inicialitzaTaula(int[][] taula, int valor) {
		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula[i].length; j++) {
				taula[i][j] = valor;
			}
		}
	}
	public static String taulaToString(int[][] taula) {
		String resultat = "";
		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula[i].length; j++) {
				resultat += taula[i][j] + " ";
			}
			resultat += "\n";
		}
		return resultat;
	}
}
