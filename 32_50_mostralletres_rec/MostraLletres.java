/*Desenvolupa un programa que demani un text i mostri només les lletres d'aquest.  */
public class MostraLletres {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        mostraLletres(text);
        System.out.println();   // un salt de línia final
    }
    // mostra només les lletres de text
    public static void mostraLletres(String text) {
        String limpio = "";
        if (text.length() > 0) {      
            char primer = text.charAt(0);
            if (Character.isLetter(primer)) {
                limpio = limpio + text.charAt(0); 
            }
            // considerem les lletres que conté la resta del text
            String restaText = text.substring(1);
            System.out.print(limpio);
            mostraLletres(restaText);      // crida recursiva
        }
    }
}
