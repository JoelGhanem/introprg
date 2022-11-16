//Desenvolupa un programa que vagi demanant texts fins que un no contingui el darrer caràcter del text anterior. El primer text és acceptat sempre a menys que estigui buit.
public class ConteDarrer {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();
        System.out.println("bé");
        char ultimaLetra = text.charAt(text.length()-1);
        boolean correcto = true;
        while (correcto == true) {
            text = Entrada.readLine();
            // Mientras el texto no est'e vacio pasalo a minusculas
            if (!text.isEmpty()) {
                // paso el texto a minusculas
                text = text.toLowerCase();
                // Vuelvo a declarar la ultima letra
                ultimaLetra = text.charAt(text.length()-1);
                System.out.println(ultimaLetra);
            }
            // Paso el boolean a falso para asegurasrme de q esta bien hecho
            correcto = false;
            // Hago un for para que me revise todas las letras en busca de la ultima letra
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ultimaLetra) {
                    correcto = true;
                }else {
                    correcto = false;
                }
            }
            //Si una de las letras es la ultima de antes 
            if (correcto == true) {
                System.out.println("bé");
            }else {
                break;
            }
        }
        System.out.println("Adéu");
    }
}
