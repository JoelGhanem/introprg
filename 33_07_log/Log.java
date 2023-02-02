/*Biblioteca que ens ajuda a fer un log*/
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Log {
    private static int comptador = 1;
    public static void printError(String text) throws IOException {
        String cami = "./log.txt";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami,true));
        sortida.write("[" + comptador + "]" + " ERROR: " + text);
        comptador++;
        sortida.newLine();
        sortida.close();
    }
    public static void printWarning(String text) throws IOException {
        String cami = "./log.txt";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami,true));
        sortida.write("[" + comptador + "]" + " WARNING: " + text);
        comptador++;
        sortida.newLine();
        sortida.close();
    }
    public static void printInfo(String text) throws IOException {
        String cami = "./log.txt";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami,true));
        sortida.write("[" + comptador + "]" + " INFO: " + text);
        comptador++;
        sortida.newLine();
        sortida.close();
    }
    public static void printDebug(String text)  throws IOException {
        String cami = "./log.txt";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami,true));
        sortida.write("[" + comptador + "]" + " DEBUG: " + text);
        comptador++;
        sortida.newLine();
        sortida.close();
    }
    public static void reset() {
        comptador = 1;
    }
}
