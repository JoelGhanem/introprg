/*Biblioteca que ens ajuda a fer un log*/
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class Log {
    private static int comptador = 1;
    public static String printError(String text) throws IOException {
        String cami = "./log.txt";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami,true));
        BufferedReader lectura = new BufferedReader(new FileReader(cami));
        sortida.write("[" + comptador + "]" + " ERROR: " + text);
        comptador++;
        sortida.newLine();
        sortida.close();
        String leido = lectura.readLine();
        lectura.close();
        return leido;
    }
    public static String printWarning(String text) throws IOException {
        String algo = "";
        String cami = "./log.txt";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami,true));
        sortida.write("[" + comptador + "]" + " WARNING: " + text);
        comptador++;
        sortida.newLine();
        sortida.close();
        return algo;
    }
    public static String printInfo(String text) throws IOException {
        String algo = "";
        String cami = "./log.txt";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami,true));
        sortida.write("[" + comptador + "]" + " INFO: " + text);
        comptador++;
        sortida.newLine();
        sortida.close();
        return algo;
    }
    public static String printDebug(String text)  throws IOException {
        String algo = "";
        String cami = "./log.txt";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami,true));
        sortida.write("[" + comptador + "]" + " DEBUG: " + text);
        comptador++;
        sortida.newLine();
        sortida.close();
        return algo;
    }
    public static void reset() {
        comptador = 1;
    }
}
