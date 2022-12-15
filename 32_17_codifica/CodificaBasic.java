//En aquesta ocasió, desenvoluparem un programa que demani un text i el mostri codificat segons les següents instruccions://
public class CodificaBasic {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println("Quants?");
        int quants = Integer.parseInt(Entrada.readLine());
        if (!text.isEmpty()) {
            codifica(text, quants);
        }
    }
    public static void codifica(String text, int quants) {
        String cadena = "";
        char letra;
        if (quants > 0) {
            for (int i = 0; i < text.length(); i++) {
                letra = text.charAt(i);
                if (letra >= 'a' && letra <= 'z') {
                    for (int j = 1; j <= quants; j++) {
                        letra = ((char)(letra + j));
                        if (letra > 'z') {
                            letra = 'a';
                        }
                        cadena = cadena + letra;
                    }
                } else {
                    cadena = cadena + letra;
                }
            }
            System.out.println(cadena);
        }
    }
}
