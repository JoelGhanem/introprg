/*El programa CadenaContinua farà el pràcticament el mateix que la versió original però els càlculs els realitzarà una funció anomenada cadenaContinua()La nova versió, però, serà capaç de controlar el cas en que no introdueixin un número enter per la longitud de la cadena resultant.*/
public class CadenaContinua {
	public static void main(String[] args) {

		System.out.println("Text?");
		String text = Entrada.readLine();
		if (text.isEmpty()) {
			System.out.println("error");
		}	else {
			System.out.println("Nombre?");
			String num = Entrada.readLine();
			if (UtilString.esEnter(num)) {
				int enter = UtilString.aEnter(num,false);
				if (enter < 1) { 
				} else { 
					System.out.println(UtilString.cadenaContinua(text,enter));
				}
			} else {
				System.out.println("error");
			}
			System.out.println();
		}
	}
}
