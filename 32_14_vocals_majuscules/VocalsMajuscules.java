//Desenvolupa una nova versió de l'exercici que filtrava les lletres d'un text.//
public class VocalsMajuscules {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        majusculitzaVocals(text);
    }
    public static void majusculitzaVocals(String text) {
        char mayus;
        char minus;
        String cadena = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u' || text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'I' || text.charAt(i) == 'O' || text.charAt(i) == 'U') {
                mayus = Character.toUpperCase(text.charAt(i));
                cadena = cadena + mayus; 
            } else {
                minus = Character.toLowerCase(text.charAt(i));
                cadena = cadena + minus; 
            }
        }
        System.out.print(cadena);
    }
}
