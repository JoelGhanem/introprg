//Exercici que diu is una paraula comença per vocal catalana a un fitxer
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FitxerVocalIniciFi {
    public static void main(String[] args) throws IOException {
        String cami = "frases.txt";
        BufferedReader input = new BufferedReader(new FileReader(cami));
        System.out.println(input.readLine());       // escriu: primera línia
        System.out.println(input.readLine());       // escriu: segona línia
        System.out.println(input.readLine());       // escriu: null
        input.close();
    }
}
