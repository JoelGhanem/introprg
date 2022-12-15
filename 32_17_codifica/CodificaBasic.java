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
        if (Character.isUpperCase(text.charAt(0))) {
            letra = text.charAt(0);
            cadena = cadena + letra;
        } else if (Character.isLowerCase(text.charAt(0))) {
            letra = text.charAt(0);
            letra = ((char) (letra + quants));
        }
        for (int i = 1; i < text.length(); i++) {
            letra = text.charAt(i);
            for (int j = 0; j <= quants; j++) {
                letra = ((char) (letra + j));
                if (letra >= 'z') {
                    letra = 'a';
                }
                cadena = cadena + letra;
                break;
            }
        }
        System.out.println(cadena);
    }
}
