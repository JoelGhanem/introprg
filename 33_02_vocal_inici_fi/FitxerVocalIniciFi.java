//Exercici que diu is una paraula comença per vocal catalana a un fitxer
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FitxerVocalIniciFi {
    public static void main(String[] args) throws IOException {
        String cami = "frases.txt";
        BufferedReader linia = new BufferedReader(new FileReader(cami));
        String paraula = linia.readLine();
        while (true) {
            if (UtilString.esVocal(paraula.charAt(0)) || UtilString.esVocal(paraula.charAt(paraula.length()-1))) {
                System.out.println(paraula);
                break;
            }
            if (linia == null) {
                break;
            }
        }
    }
}
