// Hay q leer un archivo con el texto original, otro archivo con el texto a traducir y escribir la traduccion en otro archivo, hay que usar el .replace         
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Traduccio {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("ERROR: Cal especificar els fitxers origen, traduccio i destinació");
        } else {
            String fitxerOrigen = args[0];
            String fitxerTraduccio = args[1];
            String fitxerDestinacio = args[2];
            tradueix(fitxerOrigen, fitxerTraduccio, fitxerDestinacio);
        }
    }
    //aquest modul rep els camins i tradueix
    public static void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) { 
        BufferedReader origen = new BufferedReader(new FileReader(fitxerOrigen));
        BufferedReader traduccio = new BufferedReader(new FileReader(fitxerTraduccio));
        BufferedWriter sortidaDestinacio = new BufferedWriter(new FileWriter(fitxerDestinacio));
        while (true) {
            if (origen == null) {
                break;
            } else if (traduccio == null) {
                break;
            }
        }
        public static String tradueixLinia(String linia, String fitxerTraduccio) {
            while (true) {
            String linia = traduit.readLine();
            return traduit;
        }
    }
