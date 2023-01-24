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
            linies += 1;
            if (null == linia) break;
        }
        String[] paraules = new String[linies];
        String primeraParaula = paraules[0];
        for (int i = 0; i < primeraParaula.length(); i++) {
            if (UtilString.esVocal(primeraParaula.charAt(i))) {
                System.out.println(primeraParaula);       // escriu: primera línia
            }
        }
        input.close();
    }
}
