//Desenvolupa un programa que demani un text i mostri el mateix text amb les inicials de cada paraula en majúscules i la resta en minúscules.
public class MajusculitzaInicials {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String cadena = "";
        char letra;
        char mayus;
        for (int i = 0; i < text.length();i++) {
            // Si no es letra haces la sigueinte mayuscula
            if (!Character.isLetter(text.charAt(i))) {
                
                mayus = Character.toUpperCase(text.charAt(i + 1));
                cadena = cadena + mayus;
            } else {
                mayus = Character.toLowerCase(text.charAt(i));
                cadena = cadena + mayus;
            }
        }
        System.out.println(cadena);
    }
}
