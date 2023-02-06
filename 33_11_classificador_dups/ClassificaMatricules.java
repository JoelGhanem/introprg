//Aquest exercici és una versió ampliada de l'exercici anterior. La ampliació consisteix en evitar que els fitxers de sortida tinguin repetits.
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class ClassificaMatricules {
    public static void main(String[] args) throws IOException{
        BufferedReader llegides = new BufferedReader(new FileReader("llegides.txt"));
        int contadorI = 0;
        int contadorD = 0;
        while (true) {
            String linia = llegides.readLine();
            if (linia == null) {
                break;
            }
            if (esItaliana(linia)) {
                if (contadorI == 0) {
                    contadorI++;
                    italianaPrimer(linia);
                } else {
                    System.out.println("italiana: " + linia);
                    italiana(linia);
                }
            } else {
                if (contadorD == 0) {
                    contadorD++;
                    desconegudaPrimer(linia);
                } else {
                    System.out.println("desconeguda: " + linia);
                    desconeguda(linia);
                }
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
        String leido = linia.trim();
        String cami = "italianes.txt";
        BufferedWriter italianaWrite = new BufferedWriter(new FileWriter(cami));
        BufferedReader italianaRead = new BufferedReader(new FileReader(cami));
        while(true) {
            String italianaR = italianaRead.readLine();
            if (italianaR == null) {
                break;
            }
            if (!italianaR.equals(leido)) {
                italianaWrite.write(leido.trim());
                italianaWrite.newLine();
            } else {
                break;
            }
        }
    }
    public static void desconeguda(String linia) throws IOException{
        String leido = linia.trim();
        String cami = "desconegudes.txt";
        BufferedWriter desconegudesWrite = new BufferedWriter(new FileWriter(cami));
        BufferedReader desconegudaRead = new BufferedReader(new FileReader(cami));
        while(true) {
            String desconegudaR = desconegudaRead.readLine();
            if (desconegudaR == null) {
                break;
            }
            if (!desconegudaR.equals(leido)) {
                desconegudesWrite.write(leido.trim());
                desconegudesWrite.newLine();
            } else {
                break;
            }
        }
    }
    public static void italianaPrimer(String linia) throws IOException {
        String leido = linia.trim();
        String cami = "italianes.txt";
        BufferedWriter italianaWrite = new BufferedWriter(new FileWriter(cami));
        italianaWrite.write(leido.trim());
        italianaWrite.newLine();
    }
    public static void desconegudaPrimer(String linia) throws IOException {
        String leido = linia.trim();
        String cami = "desconegudes.txt";
        BufferedWriter desconegudesWrite = new BufferedWriter(new FileWriter(cami));
        desconegudesWrite.write(leido);
        desconegudesWrite.newLine();
    }
}
