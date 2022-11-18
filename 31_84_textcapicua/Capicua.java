//Desenvolupa un programa que demani un text i indiqui si el text és o no capicua.
public class Capicua {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        char letra;
        char letraReves;
        boolean check = true;
        //leo las palabras
        for (int i = 0; i < text.length(); i++) {
            letra = text.charAt(i);
            System.out.print(letra);
            for (int j = text.length()-1; j >= 0; j--) {
                letraReves = text.charAt(j);
                System.out.print(letraReves);
                if (letra == letraReves) {
                    check = true;
                } else {
                    check = false;
                }
            }
        }
        if (check) {
            System.out.println("És capicua");
        } else {
            System.out.println("No és capicua");
        }
    }
}

