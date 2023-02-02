// Hay q leer un archivo con el texto original, otro archivo con el texto a traducir y escribir la traduccion en otro archivo, hay que usar el .replace         
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Traduccio {
    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("ERROR: Cal especificar els fitxers origen, traduccio i destinació");
        } else {
            String fitxerOrigen = args[0];
            String fitxerTraduccio = args[1];
            String fitxerDestinacio = args[2];
            tradueix(fitxerOrigen, fitxerTraduccio, fitxerDestinacio);
        }
    }
    //aquest modul rep els camins i tradueix
    public static void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) throws IOException{ 
        BufferedReader origen = new BufferedReader(new FileReader(fitxerOrigen));
        BufferedWriter sortidaDestinacio = new BufferedWriter(new FileWriter(fitxerDestinacio));
        while (true) {
            String original = origen.readLine();
            if (original == null) {
                break;
            } 
            String traduit = tradueixLinia(original, fitxerTraduccio);
            sortidaDestinacio.write(traduit);
        }
        origen.close();
        sortidaDestinacio.close();
    }
    // tengo que ir input por input replacing cada apartado por lo que diga en el traduccio.txt
    public static String tradueixLinia(String original, String fitxerTraduccio) throws IOException{
        BufferedReader traduccio = new BufferedReader(new FileReader(fitxerTraduccio));
        String linia = "algo";
        while (true) {
            linia = traduccio.readLine();
            if (linia == null) {
                break;
            }
            String [] liniaArray = linia.split(",");
            linia.replace(liniaArray[0],liniaArray[1].trim());
        }
        traduccio.close();
        return linia;
    }
}
