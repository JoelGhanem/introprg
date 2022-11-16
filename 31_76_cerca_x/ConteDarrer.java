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
            if (!text.isEmpty()) {
                text = text.toLowerCase();
            }
            correcto = false;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ultimaLetra) {
                    correcto = true;
                }else {
                    correcto = false;
                }
            }
            if (correcto == true) {
                System.out.println("bé");
                text = Entrada.readLine();
                text = text.toLowerCase();
                ultimaLetra = text.charAt(text.length()-1);
            }else {
                break;
            }
        }
        System.out.println("Adéu");
    }
}
