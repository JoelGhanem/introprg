//En aquesta ocasió, desenvoluparàs un programa que obtindrà un text per entrada estàndard i mostrarà per sortida estàndard totes les subcadenes possibles, tenint en comptes només les lletres.
public class Subcadenes {
    public static void main(String[] args) {
        System.out.printf("Text?%n");
        String text = Entrada.readLine();
        text = netejaText(text);
        mostraText(text, text.length());
    }
    public static String netejaText(String text) {
        if (text.length() == 0) {
            return = "";
        }

