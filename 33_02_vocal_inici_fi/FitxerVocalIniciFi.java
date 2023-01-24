//Exercici que diu is una paraula comença per vocal catalana a un fitxer
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FitxerVocalIniciFi {
    public static void main(String[] args) throws IOException {
        String cami = "frases.txt";
        BufferedReader input = new BufferedReader(new FileReader(cami));
        while (input != null) {
            String paraula = input.readLine();
            if (paraula.length() >0) {
                if (UtilString.esVocal(paraula.charAt(0)) || UtilString.esVocal(paraula.charAt(paraula.length()-1))) {
                    System.out.println(paraula);
                }
            }
        }
        input.close();
    }
}
