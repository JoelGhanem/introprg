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
                //si es letra
                if (Character.isLetter(numero.charAt(num))) {
                    letra = true;
                    //si es simbolo    
                }else if (numero.charAt(num) == '+' || numero.charAt(num) == '-') {
                    numSimbols = numSimbols + 1;
                    if (numSimbols > 1) {
                        simbolo = true;
                    }
                    //todo lo demas    
                }else {
                    correcto = true;
                }
            }
            // si es cierto que hay simbolo
            if (simbolo == true) {
                System.out.println("No és enter");
                //si es cierto que hay una letra
            } else if(letra == true)  {
                System.out.println("No és enter");
                //si es cierto que es un digito
            } else {
                System.out.println("És enter");
            }
            numero = Entrada.readLine();
        }
        System.out.println("Adéu");
    }
}
