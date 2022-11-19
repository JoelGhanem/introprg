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
        boolean check = true;
        for (int i = 0; i < text.length(); i++) {
            letra = text.charAt(i);
            letter = letras.charAt(i);
            if (letra == letter) {
                if (letra == 'z') {
                    letra = 'a';
                }
                letra = ((char) (num + '0'));
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
