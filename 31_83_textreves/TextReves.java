// Desenvolupa un programa que demani un text i el torni a mostrar però invertint l'ordre dels caràcters que el composen. Els caracters resultants apareixeran separats per comes.
public class TextReves {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String auxiliar = "";
        String reverso = "";
        String prueba = "";
        char letra;
        char letraReves;
        boolean check = true;
        //pillo cada letra y creo un stirng auxiliar
        for (int i = 0;i < text.length();i++) {
            letra = text.charAt(i);
            auxiliar = auxiliar + letra; 
            //System.out.println(auxiliar);
        }
        for (int i = auxiliar.length()-1;i >= 0;i--) {
            letraReves = auxiliar.charAt(i);
            reverso = reverso + letraReves;
            if (check) {
                System.out.print(auxiliar.charAt(auxiliar.length()-1));
                check = false;
            }
            else {
                System.out.print(", " + letraReves);
            }
        }
    }
}
