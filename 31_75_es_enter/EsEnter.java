//Desenvolupa un programa que vagi demanant texts fins rebre la cadena buida.
public class EsEnter {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String numero = Entrada.readLine();
        int largo = numero.length();
        int numerico = 1;
        for (int num = 0; num < largo; num ++) {
            if (!numero.isEmpty()) {
                if (Character.isLetter(numero.charAt(num))) {
                    numerico = (numerico * 1);
                }
                else {
                    numerico = (numerico * 0);
                }
            }
            if (numerico != 1) {
                System.out.println("És enter");
            }
            else {
                System.out.println("No és enter");
            }
        }
        numero = Entrada.readLine();
        System.out.println("Adéu");
    }
}
