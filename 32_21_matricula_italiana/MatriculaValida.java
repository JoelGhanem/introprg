//Desenvolupa un programa que demani a l'usuari una matrícula i li digui si el que li ha introduït correspon a una matrícula italiana vàlida en el format vigent.//
public class MatriculaValida {
	public static void main(String[] args) {

		System.out.println("Introduïu una matrícula");
		String matriculaItaliana = Entrada.readLine();
		if (matriculaItaliana.length() != 7) {
			System.out.println("No és una matrícula italiana vàlida");
			return;
		}
		if (!((esLletraValidaPerMatriculaItaliana(matriculaItaliana.charAt(0))) && (esLletraValidaPerMatriculaItaliana(matriculaItaliana.charAt(1))))) {
				System.out.println("No és una matrícula italiana vàlida");
				return;
		}
		if (!((Character.isDigit(matriculaItaliana.charAt(2))) && Character.isDigit(matriculaItaliana.charAt(3)) && Character.isDigit(matriculaItaliana.charAt(4)))) {
				System.out.println("No és una matrícula italiana vàlida");
				return;
		}
		for (int i = 5; i < matriculaItaliana.length(); i++) {

			if (!(esLletraValidaPerMatriculaItaliana(matriculaItaliana.charAt(i)))) {
				System.out.println("No és una matrícula italiana vàlida");
				return;
			}
		}
		System.out.println("És una matrícula italiana vàlida");
	}

	public static boolean esLletraValidaPerMatriculaItaliana(char lletra) {
 
		if (lletra < 65 || lletra > 90) {
			return false;
		}
		
		String noEsLletraValida = "I,O,Q,U";
		
		for (int i = 0; i < noEsLletraValida.length(); i++) {
			if (noEsLletraValida.charAt(i) == lletra) {
				return false;
			}
		}

		return true;
	}
}
