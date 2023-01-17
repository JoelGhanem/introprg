public class TaulaEnterAString {
	public static void main(String[] args){
		for (int i=0; i<args.length; i++) {
			System.out.println();
			System.out.println(args[i]);
			if (!especificacioCorrecta(args[i])) {
				System.out.println("Especificació no vàlida");
			} else {
				int files = obteFiles(args[i]);
				int columnes = obteColumnes(args[i]);
				if (files < 1 || columnes < 1) {
					System.out.println("Especificació no vàlida");
				} else {
					int[][] taula  = new int[files][columnes];
					UtilTaula.inicialitzaTaula(taula, 1);
					String resultat = UtilTaula.taulaToString(taula);
					System.out.println(resultat);
				}
			}
		}
	}



	public static boolean especificacioCorrecta(String especificacio) {
		/* retorna true si l'especificació és de la forma n'x'm on n i m
		 * són dos strings d'un o dos dígits.  Exemple: "12x5" seria
		 * correcta, mentre que "x3454" no.  */
		String[] coordenades = especificacio.split("x");
		if (coordenades.length != 2) return false;
		if(coordenades[0].isEmpty() || coordenades[1].isEmpty()) return false;
		if (! UtilString.esEnter(coordenades[0]) || ! UtilString.esEnter(coordenades[1])) return false;
		int valor1 = Integer.parseInt(coordenades[0]);
		int valor2 = Integer.parseInt(coordenades[1]);
		if (valor1 < 1 || valor1 > 99 || valor2 < 1 || valor2 > 99) return false;
		return true;
	}

	public static int obteFiles(String especificacio) {
		/* Aquesta funció espera l'especificació de la forma d'una taula.
		 * En cas que l'especificació sigui correcta, retornarà l'enter
		 * corresponent als primers dígits. Per exemple, si especificacio
		 * és "12x5", retornarà 12.
		 * Altrament, retornarà el valor -1.  */
		/*…*/
		String[] coordenades = especificacio.split("x");
		if (coordenades.length != 2 || !UtilString.esEnter(coordenades[0])) return -1;
		int files = Integer.parseInt(coordenades[0]);
		return files;
	}

	public static int obteColumnes(String especificacio) {
		/* Aquesta funció espera l'especificació de la forma d'una taula.
		 * En cas que l'especificació sigui correcta, retornarà l'enter
		 * corresponent als segons dígits. Per exemple, si especificacio
		 * és "12x5", retornarà 5.
		 * Altrament, retornarà el valor -1.  */
		/*…*/
		String[] coordenades = especificacio.split("x");
		if (coordenades.length != 2 || !UtilString.esEnter(coordenades[1])) return -1;
		int columnes = Integer.parseInt(coordenades[1]);
		return columnes;
	}
}

