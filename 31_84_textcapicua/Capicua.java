//Desenvolupa un programa que demani un text i indiqui si el text és o no capicua.
public class Capicua {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        char letra;
        char letraReves;
        char comprovador;
        String auxiliar = "";
        boolean check = true;
        int contador = 0;
        //leo las palabras
        for (int i = 1; i < text.length(); i++) {
            //pillo todas las letras en orden
            letra = text.charAt(i);
            //le doy la vuelta a las palabras
            letraReves = text.charAt(text.length()-i + 1);
            auxiliar = auxiliar + letraReves;
            System.out.print(letraReves);
            if (text.charAt(0) == text.charAt(0)) {
                check = true;
            }
            if (letra == letraReves) {
                check = true;
            } else {
                check = false;
            }
        }
        if (check) {
            System.out.println("És capicua");
        } else {
            System.out.println("No és capicua");
        }
    }
}
