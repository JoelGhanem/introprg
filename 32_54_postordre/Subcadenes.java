//En aquesta ocasió, desenvoluparàs un programa que obtindrà un text per entrada estàndard i mostrarà per sortida estàndard totes les subcadenes possibles, tenint en comptes només les lletres.
public class Subcadenes {
    public static void main(String[] args) {
        System.out.printf("Text?%n");
        String text = Entrada.readLine();
        text = netejaText(text);
        mostraText(text, 1);
    }
    public static String netejaText(String text) {
        if (text.length() == 0) {
            return "";
        }
        char primer = text.charAt(0);
        if (!Character.isLetter(primer)) {
            return text.substring(1);
        }
        String textNetejat = netejaText(text.substring(1));
        return primer + textNetejat;
    }
    public static void mostraText(String text, int largo) {
        if (largo > text.length()) {
            return;
        }
        if (largo == 1) {
            System.out.printf("%4d: %s%n", largo, text.substring(0, largo));
            mostraText(text, largo+1);
        } else { 
            System.out.printf("%4d: %s%n", largo, text.substring(0, largo));
                mostraText(text.substring(1), largo);
        }
    }
}
