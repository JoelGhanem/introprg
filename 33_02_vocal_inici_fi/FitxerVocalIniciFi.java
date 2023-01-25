//Exercici que diu is una paraula comença per vocal catalana a un fitxer
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FitxerVocalIniciFi {
    public static void main(String[] args) throws IOException {
        String cami = "frases.txt";
        BufferedReader input = new BufferedReader(new FileReader(cami));
        String paraula;
        while (true) {
            paraula = input.readLine();
            if (paraula == null) {
                break;
            }
            if (!paraula.isEmpty()) {
                if (UtilString.esVocal(paraula.charAt(0)) || UtilString.esVocal(paraula.charAt(paraula.length()-1))) {
                    System.out.println(paraula);
                }
            }
        }
        input.close();
    }
}
