//Desenvolupa una nova versió del programa anterior. Aquest cop, el programa, a banda de mostrar la nota màxima, indicarà també les notes introduïdes.
public class NotaMesAlta {
	public static void main(String[] args) {
		int notaMaxima = 0;
		int nota;
		int num = 0;
		String notes = "";
		System.out.println("Introdueix les notes (-1 per finalitzar)");
		nota = Integer.parseInt(Entrada.readLine());
		while (nota >= 0) {
			if (nota > notaMaxima) {
				notaMaxima = nota;
			}
			num++;
			notes += nota;
			nota = Integer.parseInt(Entrada.readLine());
		}
		if (num < 2) {
			System.out.println("Com a mínim calen dues notes");
		} else {
			String notesSeparades = "";
			for (int i = 0; i < notes.length(); i++) {
				if (i != notes.length() - 2) {
					notesSeparades += notes.charAt(i) + ", ";
				} else {
					notesSeparades += notes.charAt(i) + " i " + notes.charAt(i+1);
					break;
				}
			}
				System.out.println("La nota més alta és " + notaMaxima + " de les introduïdes: " + notesSeparades);
		}
	}
}
