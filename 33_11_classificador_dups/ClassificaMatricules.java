//Aquest exercici és una versió ampliada de l'exercici anterior. La ampliació consisteix en evitar que els fitxers de sortida tinguin repetits.
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class ClassificaMatricules {
    private static int contador = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader llegides = new BufferedReader(new FileReader("llegides.txt"));
        BufferedWriter italianes = new BufferedWriter(new FileWriter("italianes.txt"));
        BufferedWriter desconegudes = new BufferedWriter(new FileWriter("desconegudes.txt"));
        BufferedReader desconegudesR = new BufferedReader(new FileReader("desconegudes.txt"));
        while (true) {
            String linia = llegides.readLine();
            if (linia == null) {
                break;
            }
            contador++;
            linia = linia.trim();
            if (!repetida(linia)) {
                if (esItaliana(linia)) {
                    italianes.write(linia);
                    italianes.newLine();
                } else {
                    desconegudes.write(linia);
                    desconegudes.newLine();
                }
            }
        }
        llegides.close();
        italianes.close();
        desconegudes.close();
        desconegudesR.close();
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
    public static boolean repetida(String linia) throws IOException{
        BufferedReader llegida = new BufferedReader(new FileReader("llegides.txt"));
        while (true) {
            String italiana = llegida.readLine();
            if (italiana == null) {
                break;
            }
            italiana = italiana.trim();
            for (int i = 1; i < contador; i++) {
                if (italiana.contains(linia)) {
                    llegida.close();
                    return true;
                }
            }
        }
            llegida.close();
            return false;
    }
}
