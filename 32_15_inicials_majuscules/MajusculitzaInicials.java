//Desenvolupa un programa que demani un text i mostri el mateix text amb les inicials d    e cada paraula en majúscules i la resta en minúscules.//
public class MajusculitzaInicials {
    public static void main (String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        majusculitzaInicials(text);
    }
    public static void majusculitzaInicials(String text) {
        String cadena = "";
        char inicial;
        char letra;
        if (Character.isLetter(text.charAt(0))) {
            inicial = Character.toUpperCase(text.charAt(0));
            cadena = cadena + inicial;
        } else {
            letra = text.charAt(0);
            cadena = cadena + letra;
        }
        for (int i = 1; i < text.length(); i++) {
            if (!Character.isLetter(text.charAt(i -1))) {
                letra = Character.toUpperCase(text.charAt(i));
                cadena = cadena + letra;
            } else {
                letra = Character.toLowerCase(text.charAt(i));
                cadena = cadena + letra;
            }
        }
        System.out.println(cadena);
    }
}

