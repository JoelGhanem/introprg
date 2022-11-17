//Desenvolupa un programa que vagi demanant texts fins que un no contingui el darrer caràcter del text anterior. El primer text és acceptat sempre a menys que estigui buit.
public class ConteDarrer {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();
        char ultimaLetra = text.charAt(text.length()-1);
        boolean correcto = true;
        if (text.isEmpty()) {
            System.out.println("Adéu");
        } else {
            while (correcto == true) {
                System.out.println("bé");
                text = Entrada.readLine(); // paso el texto a minusculas
                text = text.toLowerCase(); // Vuelvo a declarar la ultima letra
                ultimaLetra = text.charAt(text.length()-1);
                System.out.println(ultimaLetra); // Hago un for para que me revise todas las letras en busca de la ultima letra
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == ultimaLetra) {
                        correcto = true;
                        ultimaLetra = text.charAt(text.length()-1);
                        break;
                    }else {
                        correcto = false;
                    }
                }
            }
        }
        System.out.println("Adéu");
    }
}
