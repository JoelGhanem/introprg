//Exercici que diu is una paraula comença per vocal catalana a un fitxer
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FitxerVocalIniciFi {
    public static void main(String[] args) throws IOException {
        String cami = "frases.txt";
        BufferedReader input = new BufferedReader(new FileReader(cami));
        int linies = 0;
        while (true) {
            String linia = input.readLine();
            if (null == linia) break;
            linies += 1;
        }
        String[] paraules = new String[linies];
        for (int i = 0; i < paraules.length; i++) {
            paraules[i] = input.readLine();
            if (UtilString.esVocal(paraules[i].charAt(0))) { 
                System.out.println(paraules);       // escriu: paraula q comenca amb vocal
            }
            if (UtilString.esVocal(paraules[i].charAt((paraules.length)-1))) {
                System.out.println(paraules);       // escriu: paraula q comenca o acaba amb vocal
            }
        }
        input.close();
    }
}
