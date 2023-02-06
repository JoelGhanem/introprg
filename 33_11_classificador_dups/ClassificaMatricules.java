//Aquest exercici és una versió ampliada de l'exercici anterior. La ampliació consisteix en evitar que els fitxers de sortida tinguin repetits.
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class ClassificaMatricules {
    public static void main(String[] args) throws IOException{
        BufferedReader llegides = new BufferedReader(new FileReader("llegides.txt"));
        BufferedWriter italianes = new BufferedWriter(new FileWriter("italianes.txt"));
        BufferedReader italianesR = new BufferedReader(new FileReader("italianes.txt"));
        BufferedWriter desconegudes = new BufferedWriter(new FileWriter("desconegudes.txt"));
        BufferedReader desconegudesR = new BufferedReader(new FileReader("desconegudes.txt"));
        while (true) {
            String linia = llegides.readLine();
            if (llegides == null) {
                break;
            }
            linia = linia.trim();
            if (esItaliana(linia)) {
                if (!repetidaI(linia, italianesR)) {
                    italianes.write(linia);
                    italianes.newLine();
                }
            } else {
                if (!repetidaD(linia, desconegudesR)) {
                    desconegudes.write(linia);
                    desconegudes.newLine();
                }
            }
        }
    }
    public static boolean esItaliana(String linia) {
        String confuses = "IOQU";
        for (int i = 0; i < 2; i++) {
            if (!Character.isUpperCase(linia.charAt(i))) {
                return false;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < confuses.length(); j++) {
                if (linia.charAt(i) == confuses.charAt(j)) {
                    return false;
                }
            }
        }
        for (int i = 2; i < 5; i++) {
            if (!Character.isDigit(linia.charAt(i))) {
                return false;
            }
        }
        for (int i = 5; i < 7; i++) {
            if (!Character.isUpperCase(linia.charAt(i))) {
                return false;
            }
        }
        for (int i = 5; i < 7; i++) {
            for (int j = 0; j < confuses.length(); j++) {
                if (linia.charAt(i) == confuses.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean repetidaI(String linia, BufferedReader italianesR) throws IOException{
        while (true) {
            String italiana = italianesR.readLine();
            if (italiana == null) {
                return false;
            }
            if (italiana.equals(linia)) {
                return true;
            }
        }
    }
    public static boolean repetidaD(String linia, BufferedReader desconegudesR) throws IOException{
        while (true) {
            String desconeguda = desconegudesR.readLine();
            if (desconeguda == null) {
                return false;
            }
            if (desconeguda.equals(linia)) {
                return true;
            }
        }
    }
}
