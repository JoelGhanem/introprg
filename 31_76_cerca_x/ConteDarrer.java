//Desenvolupa un programa que vagi demanant texts fins que un no contingui el darrer caràcter del text anterior. El primer text és acceptat sempre a menys que estigui buit.
public class ConteDarrer {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();
        System.out.println("bé");
        char ultimaLetra = text.charAt(text.length()-1);
        boolean correcto = true;
        while (!text.isEmpty() && correcto == true) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == (ultimaLetra + 32)) {
                    correcto = true;
                }else {
                    correcto = false;
                }
            }
            if (correcto == true) {
                System.out.println("bé");
                text = Entrada.readLine();
            }
        }
        System.out.println("Adéu");
    }
}
