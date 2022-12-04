// Desenvolupa una nova versió de l'exercici que filtrava les lletres d'un text.//
public class NomesLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        filtraLletres(text);
    }
    public static void filtraLletres(String text) {
        String cadena = "";
        boolean check = false;
        char letra;
        for(int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                letra = text.charAt(i);
                cadena = cadena + letra;
                if (check == false) {
                    System.out.print(letra);
                    check = true;
                } else {
                    System.out.print(", " + letra);
                }
            }
        }
    }
}

