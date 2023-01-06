/*El programa EsEnter farà pràcticament el mateix que la versió original però els càlculs els realitzarà una funció anomenada esEnter(), que rebrà el text corresponent i retornarà un booleà amb el resultat.*/
public class EsEnter {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();
        text = text.strip();
        UtilString.esEnter(text);
        if (UtilString.esEnter(text)) {
            System.out.println("És enter");
        } else {
            System.out.println("No és enter");
        }
        System.out.println("Adéu");
    }
}

