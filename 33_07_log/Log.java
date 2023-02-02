/*Biblioteca que ens ajuda a fer un log*/
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class Log {
    private static int comptador = 0;
    public static String printError(String text) throws IOException {
        comptador++;
        String cami = "./log.txt";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami,true));
        sortida.write("[" + comptador + "]" + " ERROR: " + text);
        sortida.newLine();
        sortida.close();
        return ("[" + comptador + "]" + " ERROR: " + text);
    }
    public static String printWarning(String text) throws IOException {
        comptador++;
        String algo = "";
        String cami = "./log.txt";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami,true));
        sortida.write("[" + comptador + "]" + " WARNING: " + text);
        sortida.newLine();
        sortida.close();
        BufferedReader lectura = new BufferedReader(new FileReader(cami));
        String leido = lectura.readLine();
        lectura.close();
        return ("[" + comptador + "]" + " WARNING: " + text);
    }
    public static String printInfo(String text) throws IOException {
        comptador++;
        String algo = "";
        String cami = "./log.txt";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami,true));
        sortida.write("[" + comptador + "]" + " INFO: " + text);
        sortida.newLine();
        sortida.close();
        return ("[" + comptador + "]" + " INFO: " + text);
    }
    public static String printDebug(String text)  throws IOException {
        comptador++;
        String algo = "";
        String cami = "./log.txt";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami,true));
        sortida.write("[" + comptador + "]" + " DEBUG: " + text);
        sortida.newLine();
        sortida.close();
        return ("[" + comptador + "]" + " DEBUG: " + text);
    }
    public static void reset() {
        comptador = 0;
    }
}
