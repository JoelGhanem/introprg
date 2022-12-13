//En aquesta ocasió, desenvoluparem un programa que demani un text i el mostri codificat segons les següents instruccions://
public class CodificaBasic {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println("Quants?");
        int quants = Integer.parseInt(Entrada.readLine());
        codifica(text, quants);
    }
    public static void codifica(String text, int quants) {
        boolean check = true;
        String cadena = "";
        char letra;
        if (quants >= 0) {
            for (int i = 0; i < text.length(); i++) {
                letra = text.charAt(i);
                if (Character.isLetter(letra)) {
                    if (letra == 'z') {
                        letra = ((char)96);
                    }
                    if (letra != 0) {
                        letra = ((char)(letra + quants));
                        cadena = cadena + letra;
                    }
                } else {
                    cadena = cadena + letra;
                }
            }
            System.out.println(cadena);
        } else {
            System.out.println("No s'accepten números negatius");
        }
    }
}

