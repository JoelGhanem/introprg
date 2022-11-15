//Desenvolupa un programa que vagi demanant texts fins rebre la cadena buida.
public class EsEnter {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String numero = Entrada.readLine();
        int largo = numero.length();
        char cero = numero.charAt(0);
        boolean check = false;
        int numSimbols = 0;
        while (!numero.isEmpty()) {
            for (int num = 0; num < largo; num ++) {
                if (numero.charAt(num) == '+' || numero.charAt(num) == '-') {
                    numSimbols = numSimbols + 1;
                    if (Character.isLetter(numero.charAt(num))) {
                        check = false;
                    }else {
                        check = true;
                    }
                }
                if (numSimbols > 1) {
                    System.out.println("No és enter");
                }
                else if (check == true) {
                    System.out.println("És enter");
                } else  {
                    System.out.println("No és enter");
                }
                numero = Entrada.readLine();
            }
        }
        System.out.println("Adéu");
    }
}
