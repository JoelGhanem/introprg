/*Programa que revisa les matricules i diu si son italianes o no segons el fitxer on les escriu*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class ClassificaMatricules{ 
    public static void main (String[] args) throws IOException{
        String desconegudes = "desconegudes.txt";
        BufferedWriter eDesconegudes = new BufferedWriter(new FileWriter(desconegudes));
        String cami = "llegides.txt";
        BufferedReader lectura = new BufferedReader(new FileReader(cami));
        String italianes = "italianes.txt";
        BufferedWriter eItalianes = new BufferedWriter(new FileWriter(italianes));
        while (true) {
            String leido = lectura.readLine();
            if (leido == null) {
                break;
            }
            leido = leido.trim();
            if (matriculaItalianaValida(leido)) {
                eItalianes.write(leido.trim());
                eItalianes.newLine();
            } else {
                eDesconegudes.write(leido.trim());
                eDesconegudes.newLine();
            }
        }
        lectura.close();
        eDesconegudes.close();
        eItalianes.close();
    }
    public static boolean matriculaItalianaValida(String matricula) {
        boolean esItaliana = false;
        String confusas = "IOQU";
        if (matricula.length() != 7) {
            return esItaliana;
        }
        // Verificar los primeros dos caracteres
        if (!Character.isUpperCase(matricula.charAt(0)) || !Character.isUpperCase(matricula.charAt(1))) {
            return esItaliana;
        }
        // Verificar si los caracteres 0 y 1 son confusos
        for (int i = 0; i < confusas.length(); i++) {
            if (matricula.charAt(0) == confusas.charAt(i) || matricula.charAt(1) == confusas.charAt(i)) {
                return esItaliana;
            }
        }
        // Verificar los caracteres 2 a 4
        for (int i = 2; i <= 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                return esItaliana;
            }
        }
        // Verificar los últimos dos caracteres
        if (!Character.isUpperCase(matricula.charAt(5)) || !Character.isUpperCase(matricula.charAt(6))) {
            return esItaliana;
        }
        for (int i = 0; i < confusas.length(); i++) {
            if (matricula.charAt(5) == confusas.charAt(i) || matricula.charAt(6) == confusas.charAt(i)) {
                return esItaliana;
            }
        }
        esItaliana = true;
        return esItaliana;
    }
}
