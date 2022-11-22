//Desenvolupa un programa que demani un text i mostri el mateix text amb les inicials de cada paraula en majúscules i la resta en minúscules.
public class MajusculitzaInicials {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String cadena = "";
        char letra;
        char mayus;
        if (Character.isLetter(text.charAt(0))) {
            letra = Character.toUpperCase(text.charAt(0));
            cadena = cadena + letra;
        } 
        for (int i = 1; i < text.length();i++) {
            // Si no es letra haces la sigueinte mayuscula
            if (!Character.isLetter(text.charAt(i -1))) {
                mayus = Character.toUpperCase(text.charAt(i));
                cadena = cadena + mayus;
            } else {
                letra = Character.toLowerCase(text.charAt(i));
                cadena = cadena + letra;
            }
        }
        System.out.println(cadena);
    }
}
