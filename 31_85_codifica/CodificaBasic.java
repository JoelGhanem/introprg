//En aquesta ocasió, desenvoluparem un programa que demani un text i el mostri codificat segons les següents instruccions:
public class CodificaBasic {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String letras = "abcdefghijklmnopqrstuvwxyz";
        String salida = "";
        char letra;
        char letter;
        int num = 1;
        int contador = 0;
        boolean check = true;
        for (int i = 0; i < text.length(); i++) {
            contador = contador + 1;
            letra = text.charAt(i);
            if (i > letras.length()) {
                contador = 0;
            }
            letter = letras.charAt(contador);
            if (letra == letter) {
                if (letra == 'z') {
                    letra = ((char)96);
                }
                letra = ((char)(letra + 1));
                salida = salida + letra;
                check = true;
            } else {
                check = false;
            }
        }
        if (check) {
            System.out.println(salida);
        } 
    }
}
