//Desenvolupa una nova versió de l'exercici que filtrava les lletres d'un text.//
public class VocalsMajuscules {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        majusculitzaVocals(text);
    }
    public static void majusculitzaVocals(String text) {
        char letra;
        char mayus;
        char minus;
        String cadena = "";
        for (int i = 0; i < text.length(); i++) {
            letra = text.charAt(i);
            Character.toLowerCase(letra);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                mayus = Character.toUpperCase(letra);
                cadena = cadena + mayus; 
            } else {
                minus = Character.toLowerCase(letra);
                cadena = cadena + minus; 
            }
        }
        System.out.print(cadena);
    }
}
