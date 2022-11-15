//Desenvolupa un programa que vagi demanant texts fins rebre la cadena buida.
public class EsEnter {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String numero = Entrada.readLine();
        int largo = numero.length()-1;
        char cero = numero.charAt(0);
        boolean letra = false;
        boolean simbolo = false;
        boolean correcto = false;
        int numSimbols = 0;
        while (!numero.isEmpty()) {
            for (int num = 0; num < largo; num ++) {
                if (Character.isLetter(numero.charAt(num))) {
                    letra = true;
                }else if (numero.charAt(num) == '+' || numero.charAt(num) == '-') {
                    numSimbols = numSimbols + 1;
                    if (numSimbols > 1) {
                        simbolo= true;
                    }
                }else {
                    correcto = true;
                }
            }
            if (simbolo == true) {
                System.out.println("No és enter");
            }
            else if (correcto == true) {
                System.out.println("És enter");
            } else if(letra == true)  {
                System.out.println("No és enter");
            }
            numero = Entrada.readLine();
        }
        System.out.println("Adéu");
    }
}
