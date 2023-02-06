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
        while (true) {
            String linia = llegides.readLine();
            if (linia == null) {
                break;
            }
            if (esItaliana(linia)) {
                italiana(linia);
                System.out.println("italiana: " + linia);
            } else {
                System.out.println("desconeguda: " + linia);
                desconeguda(linia);
            }
        }
    }
    public static boolean esItaliana(String linia) throws IOException {
        String malas = "IOQU";
        if (!Character.isUpperCase(linia.charAt(0)) || !Character.isUpperCase(linia.charAt(1))) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < malas.length(); j++) {
                if (linia.charAt(i) == malas.charAt(j)) {
                    return false;
                }
            }
        }
        for (int i = 2; i < 5; i++) {
            if (!Character.isDigit(linia.charAt(i))) {
                return false;
            }
        }
        if (!Character.isUpperCase(linia.charAt(5)) || !Character.isUpperCase(linia.charAt(6))) {
            return false;
        }
        for (int i = 5; i < 7; i++) {
            for (int j = 0; j < malas.length(); j++) {
                if (linia.charAt(i) == malas.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    //  PROBLEMAS
    //  1- No escribe nada
    public static void italiana(String linia) throws IOException{
        String cami = "italianes.txt";
        BufferedReader italianaRead = new BufferedReader(new FileReader(cami));
        BufferedWriter italianaWrite = new BufferedWriter(new FileWriter(cami));
        if (contador == 0) {
            italianaWrite.write(linia.trim());
            italianaWrite.newLine();
        }
        while(true) {
            String italianaR = italianaRead.readLine();
            if (italianaR == null) {
                break;
            }
            if (!italianaR.equals(linia)) {
                italianaWrite.write(linia.trim());
                italianaWrite.newLine();
            } else {
                break;
            }
        }
        contador++;
    }
    public static void desconeguda(String linia) throws IOException{
        String cami = "desconegudes.txt";
        BufferedReader desconegudaRead = new BufferedReader(new FileReader(cami));
        BufferedWriter desconegudesWrite = new BufferedWriter(new FileWriter(cami));
        if (contador == 0) {
            desconegudesWrite.write(linia.trim());
            desconegudesWrite.newLine();
        }
        while(true) {
            String desconegudaR = desconegudaRead.readLine();
            if (desconegudaRead == null) {
                break;
            }
            if (!desconegudaRead.equals(linia)) {
                desconegudesWrite.write(linia.trim());
                desconegudesWrite.newLine();
            } else {
                break;
            }
        }
        contador++;
    }
}
