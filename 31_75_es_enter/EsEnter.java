//Desenvolupa un programa que vagi demanant texts fins rebre la cadena buida.
public class EsEnter {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String numero = Entrada.readLine();
        int largo = numero.length();
        char cero = numero.charAt(0);
        while (!numero.isEmpty()) {
            for (int num = 1; num < largo; num ++) {
                if (!numero.isEmpty()) {
                    if (Character.isDigit(numero.charAt(num))) {
                        System.out.println("És enter");
                    } else  {
                        System.out.println("No és enter");
                    }
                }
            }
            numero = Entrada.readLine();
        }
        System.out.println("Adéu");
    }
}
