//Desenvolupa un programa que vagi demanant texts fins que un no contingui el darrer caràcter del text anterior. El primer text és acceptat sempre a menys que estigui buit.
public class ConteDarrer {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();
        boolean conte = false;
        char ultimo = text.charAt(text.length()-1);
        String ultimisimo= ultimo ;
        if (!text.isEmpty()) {
            for (int num = 0; num < text.length();num++) {
                if (text.charAt(num) == ultimo) {
                    System.out.println("bé");
                    break;
                }
            }
        }
        System.out.println("Adéu");
    }
}  
