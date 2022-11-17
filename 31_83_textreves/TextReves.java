// Desenvolupa un programa que demani un text i el torni a mostrar però invertint l'ordre dels caràcters que el composen. Els caracters resultants apareixeran separats per comes.
public class TextReves {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String auxiliar = "";
        String reverso = "";
        char letra;
        char letraReves;
        for (int i = 0;i < text.length();i++) {
            letra = text.charAt(i);
            auxiliar = auxiliar + letra; 
        }
        for (int i = 0;i < auxiliar.length();i++) {
            letraReves = auxiliar.charAt(auxiliar.length()-i);
            reverso = reverso + letraReves;
        }
            System.out.print(auxiliar.charAt(0));
        if (!auxiliar.charAt(0)) {
            System.out.print(", " + letraReves);
        }
    }
}
